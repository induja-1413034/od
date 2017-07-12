package Strings;

import java.util.Scanner;

public class seedlogic {
public static void main(String[] args){
	int a;
	int temp=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int c=1,b=a;
	while(a>0){
		temp=a%10;
		a=a/10;
		c=c*temp;
	}	
	System.out.println(c*b);
}
}
