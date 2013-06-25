#!/bin/bash
# COMMENTS:
#   Simple script to run android junit tests for this project
#
# USAGE:
#   ./scripts/run_unit_tests.sh
#
# PRE-REQS:
#  . Needs an emulator to be running already
#



function fatalError() {
    local msg=$1
    local status=$2
    echo "***FATAL*** $msg !!!"
    exit $status
}

function runCmd() {
    local cmd=$1
    echo "Running:  $cmd"
    local status=$?
    $cmd
    if [ "$status" != "0" ]; then
        fatalError "Command '$cmd' failed! See above for reasons." $status
    fi
}




apk="TicTacToe/bin/TicTacToe.apk"
testApk="TicTacToeTest/bin/TicTacToeTest.apk"
package=com.blogspot.applications4android.ttt.test
inst=android.test.InstrumentationTestRunner

echo "Running the unit-tests..."
runCmd "adb start-server"
runCmd "adb wait-for-device"
runCmd "adb -e install -r $apk"
runCmd "adb -e install -r $testApk"
runCmd "adb -e shell am instrument -w ${package}/${inst}"
echo "Successfully completed the unit-tests..."
echo
