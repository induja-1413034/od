#include<Stdio.h>
#include<conio.h>
void main()
{
char a;
printf("\nEnter the character:");
scanf("%c",&a);
if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
printf("\nIt is an alphabet");
else
printf("\nIT is not an alphabet");
getch();
}
