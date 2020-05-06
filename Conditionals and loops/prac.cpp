#include <iostream>
using namespace std;
int main()

{

//When you don't know the ASCII codes
char a;

cin>>a;


if (a>='a' && a<='z' )
{
    cout<<"1";
}

else if (a>='A' && a<='Z' )
{
    cout<<"0";
}
else
{
    cout<<"-1";
}


/* Here I directly compared a character with an integer since the 
character is stored in its ASCII code and its ASCII code is compared 
with the integers. This saves me the hassle of writing a>'a' and so on 
or simply a>'a'(which also compares ASCII (btw) && a<'z' 
*/

/*
if (a>=97 && a<=122 )
{
    cout<<"1";
}

else if (a>=65 && a<=90 )
{
    cout<<"0";
}
else
{
    cout<<"-1";
}
*/



}