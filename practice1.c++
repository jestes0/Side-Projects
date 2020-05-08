#include <iostream>

using namespace std;


int main() {

  int number;

  cout << "Enter in an integer value.\n";
  cin >> number;

do {
 if (cin.fail())
  {
    cin.clear();
    cout<<"Please enter a valid integer.\n";
    cin>>number;
  }
}while(cin.fail());

number = number + 45 - 15;

cout<<number<<" Is your new number.\n";

  return 0;
}
