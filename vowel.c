#include<stdio.h>
#include<conio.h>
void main()
{
char e,a,b;
printf("\nEnter the character:");
scanf("%c",&e);
a=(e=='a'||e=='e'||e=='i'||e=='o'||e=='u');
b=(e=='A'||e=='E'||e=='I'||e=='O'||e=='U');
if(a||b)
{
printf("\nIT is a vowel");
}
else
printf("\nIT is consonant");
getch();
}
