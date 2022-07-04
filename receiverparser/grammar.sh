#!/bin/bash

java -jar ../antlr-4.9.2-complete.jar -package REC -Dlanguage=Cpp -no-listener -visitor REC.g4
