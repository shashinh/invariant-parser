# invariant-parser

Contains a set of two ANTLR parsers to parse static artifacts to support V-PYE.

### to build
1. cd ptgparser (or receiverparser, depending on which parser's grammar has been updated) 
2. ./grammar.sh (will invoke antlr to generate the parser stubs)
3. cd ..
4. ./ptgparser.sh (or ./receiverparser.sh, depending on which parser you want a driver application for)
