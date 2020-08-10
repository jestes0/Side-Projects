#include <iostream>

using namespace std;

int formula_proc(int num)
{

  if (num < 0)
    num = num + 88 - 54;
  
  else
    num = num - 1 + 8;

  num = num * 5 + 8;

  return num;
}

int main() {

  int number, result;
  char answer;
  bool redo = true;
  
  do {
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
    
    cout<<"Would you like to enter another number? Answer y for yes and n for No.\n";
    cin>>answer;
    
    if (answer == 'y' || answer == 'Y')
    {
     redo = true;
    }
    
    else if (answer == 'n' || answer == 'N')
    {
     redo = false;
    }
    
    else
    {
     cout<<"Invalid Answer. Exiting Program.\n";
     redo = false;
    }
    
  }while (redo == true);
  
  return 0;
}
