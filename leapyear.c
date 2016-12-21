#include<Stdio.h>
#include<conio.h>
void main()
{
int a;
printf("\nEnter the year:");
scanf("%d",&a);
if((a%400==0)||(a%100!=0)&&(a%4==0))
printf("\nIT is leap year");
else
printf("\nIt is not a leap year");
getch();
}
