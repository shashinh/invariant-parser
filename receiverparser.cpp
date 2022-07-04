#include <bits/stdc++.h>

using namespace std;

extern map <int, set <int> > readReceivers(string fileName);

int main(int argc, char *argv[]) {

	try {
		readReceivers(argv[1]);
	} catch (const std::invalid_argument& ia) {
		cout << argv[1] << " parsing failed" << endl;
	}	

	return 0;
}
