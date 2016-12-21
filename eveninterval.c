#include<Stdio.h>
#include<conio.h>
void main()
{
int i,m,n,a;
printf("\nEnter the starting interval:");
scanf("%d",&m);
printf("\nEnter the ending interval:");
scanf("%d",&n);
for(i=m;i<=n;i++)
    if((i%2)!=0)
{
printf("\n%d",i);
}
getch();
}
