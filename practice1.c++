#include <iostream>

using namespace std;

int formula_proc(int num)
{

  if (num < 0)
    num = num + 88 - 54;

  else
    num = num - 5 + 8;

  num = num * 5 + 8;

  return num;
}

int main() {

  int number, result;

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

result = formula_proc(number);

cout<<result<<" Is your new number.\n";

  return 0;
}
