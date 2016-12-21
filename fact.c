#include<Stdio.h>
#include<conio.h>
void main()
{
int a,fact=1,i;
printf("\nEnter the number:");
scanf("%d",&a);
for(i=1;i<=a;i++)
{
fact=fact*i;
}
printf("\n%d",fact);
getch();
}
