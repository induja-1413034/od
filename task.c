#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k,m;
printf("\nEnter the table no:");
scanf("%d",&i);
printf("\nEnter the limit:");
scanf("%d",&j);
for(k=1;k<=j;k++)
{
    m=i*k;
printf("\n%d*%d=%d",i,k,m);
}
getch();
}
