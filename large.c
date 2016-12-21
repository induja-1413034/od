#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("\nEnter the numbers:");
scanf("%d%d%d",&a,&b,&c);
if(a>b&&a>c)
printf("A is greater");
else if(b>c)
printf("B is greater");
else
printf("C is greater");
getch();
}
