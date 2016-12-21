#include<Stdio.h>
#include<conio.h>
void main()
{
int f=0,i,n;
printf("\nEnter the number:");
scanf("%d",&n);
for(i=2;i<n/2;i++)
{
if(n%i==0)
{
    f=1;
break;
}
}
if(f==0)
printf("it is a prime no");
else
    printf("It is not a prime number");
getch();
}
