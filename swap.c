#include<Stdio.h>
#include<conio.h>
void main()
{
int a,b,temp;
printf("\nEnter the two numbers:");
scanf("%d%d",&a,&b);
temp=a;
a=b;
b=temp;
printf("\nThe swaping of 2 numbers is %d and %d",a,b);
getch();
}
