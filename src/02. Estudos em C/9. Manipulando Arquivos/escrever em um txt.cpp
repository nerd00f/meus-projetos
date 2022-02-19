#include <bits/stdc++.h>
using namespace std;

int main() {
  ofstream myfile("file.txt");
  if (myfile.is_open()) {
    myfile << "Olá mundo" << endl;
    myfile.close();
  } else
    cout << "Unable to open file";
  return 0;
}
