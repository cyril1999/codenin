#include <iostream>
using namespace std;
int main()
{
//Comparing two numbers

// int a,b;

// cin>>a>>b;

//  if (a==b)
//         {
//             cout<<"equal"<<endl
//         }
    
    
    // if (a==b)
    //     {
    //         cout<<"equal"<<endl
    //     }
    // else
    //     {
    //         if (a<b)
    //         {
    //             cout<<"b is greater";  //nested if-else
    //         }
    //         else
    //         {
    //             cout<<"a is greater";
    //         }
            
            
    //     }

// Else-if branch has a speciality that 
// it goes to the next else-if iff it fails the previous condition
// and it has to always end in an else statement 
/*
if (a==b)
       {
             cout<<"equal"<<endl
       }
else if (a>b)
{
    cout<<"a is greater";
}

else
{
    cout<<"b is greater";
    
}
            
            
*/

//checks whether the number is odd or even
int a=0;
cin>>a;
cout<<endl;

// Zero is the first non negative even integer
if (a%2==0)
{
    cout<<"THe number is even";
}

else
{
    cout<<"THe number is odd ";
}




}