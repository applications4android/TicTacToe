#!/bin/bash
# COMMENTS:
#   Simple script to:
#  . clean/build the project
#  . clean/build the test project
#  . Launch an emulator
#  . run android junit tests for this project
#
# USAGE:
#   ./scripts/run_unit_tests.sh
#                   [-h, -help, --help]
#                     [-clean, -no-build]
#  -h, -help, --help   Print this help and exit
#  -clean              Clean the projects and build them from scratch
#  -no-build           Do not build the projects
#  -avd <avd>          Launch an emulator with this AVD. By default, this script
#                      assumes that there's already an emulator (and one and only
#                      one!) running.
#
#END



function showHelp() {
    sed -e '/#END/q' $0
    exit 0
}

function fatalError() {
    local msg=$1
    local status=$2
    echo "***FATAL*** $msg !!!"
    exit $status
}

function runCmd() {
    local cmd=$1
    echo "Running:  $cmd"
    $cmd
    local status=$?
    if [ "$status" != "0" ]; then
        fatalError "Command '$cmd' failed! See above for reasons." $status
    fi
}

function emulatorRunning() {
    local ff=`adb devices | grep 'emulator-5554' | awk '{print $1}'`
    if [ "$ff" = "" ]; then
        echo 0
    else
        echo 1
    fi
}

function compile() {
    local dir=$1
    local clean=$2
    local buildfile="$dir/build.xml"
    if [ ! -e "$buildfile" ]; then
        fatalError "The buildfile '$buildfile' does not exist!"
    fi
    if [ "$clean" = "1" ]; then
        runCmd "ant -buildfile $buildfile clean"
    fi
    runCmd "ant -buildfile $buildfile debug"
}




cleanProjects=0
build=1
avd=
alreadyRunning=`emulatorRunning`

while [ "$1" != "" ]; do
    case "$1" in
        "-h" | "-help" | "--help")
            showHelp;;
        "-clean")
            cleanProjects=1
            shift;;
        "-no-build")
            build=0
            shift;;
        "-avd")
            shift
            avd=$1
            shift;;
        *)
            fatalError "Unknown option passed! '$1'";;
    esac
done

if [ "$avd" != "" ] && [ "$alreadyRunning" = "0" ]; then
    runCmd "emulator -avd $avd"
fi
runCmd "adb start-server"
runCmd "adb wait-for-device"
if [ "$build" = "1" ]; then
    compile "TicTacToe" $cleanProjects
    compile "TicTacToeTest" $cleanProjects
fi
testBuildFile="TicTacToeTest/build.xml"
runCmd "ant -buildfile $testBuildFile test"
