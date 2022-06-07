#include <bits/stdc++.h>
#include "li/structs.h"
#include "li/PointsToGraph.h"

using namespace std;

extern map <int, PointsToGraph> readLoopInvariant(string fileName);

int main(int argc, char *argv[]) {
	if (argc < 3 ) {
		cout << "usage: ./parser -c ci*.txt OR ./parser -l li*.txt";
		return 1;
	}
	
	int mode;
	if(strcmp(argv[1], "-c") == 0) {
		mode = 0;
	} else if(strcmp(argv[1], "-l") == 0) {
		mode = 1;
	} else {
		return 1;
	}

	for(int i = 2; i < argc; ++i) {
		cout << "parsing " << argv[i] << endl;
		try {
		readLoopInvariant(argv[i]);
		} catch (const std::invalid_argument& ia) {
			cout << argv[i] << " parsing failed" << endl;
		}

	}

	return 0;
}
