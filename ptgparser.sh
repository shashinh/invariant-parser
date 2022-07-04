#!/bin/bash

g++ *.cpp ptgparser/*.cpp -L/usr/local/lib/ -lantlr4-runtime -I/usr/local/include/antlr4-runtime/ -o ptgParser
