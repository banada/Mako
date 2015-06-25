#!/bin/bash
DIR=`pwd`
LOGFILE=$DIR/setup.log

echo "configuring npm..."
mkdir "~/.npm-global"
npm config set prefix '~/.npm-global'
echo PATH=~/.npm-global/bin:$PATH >> ~/.bashrc
source ~/.bashrc
echo "done"

echo "installing NodeJS modules..."
npm install -g node-red &>> $LOGFILE
echo "done"

