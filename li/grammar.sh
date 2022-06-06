#!/bin/bash

java -jar ../antlr-4.9.2-complete.jar -package LI -Dlanguage=Cpp -no-listener -visitor LI.g4
