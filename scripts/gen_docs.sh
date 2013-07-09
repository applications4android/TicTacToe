#!/bin/bash
# COMMENTS:
#   Simple script to generate javadoc from commandline
#
# USAGE:
#   ./scripts/gen_docs.sh [-h, -help, --help]
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



while [ "$1" != "" ]; do
    case "$1" in
        "-h" | "-help" | "--help")
            showHelp;;
        *)
            fatalError "Unknown option passed! '$1'";;
    esac
done

dir=`pwd`/javadocs
dir=`cygpath -w "$dir"`
cd TicTacToe/src
javadoc -d "$dir" com.blogspot.applications4android.tictactoe
