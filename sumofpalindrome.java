package GuviLogic;

import java.util.Scanner;

public class sumofpalindrome {
public static void main(String[] args){
	int a,sum=0,temp=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	while(a>0){
		temp=a%10;
		sum=sum+temp;
		a=a/10;
	}
	System.out.println(sum);
	String b=String.valueOf(sum);
	String c="";
	String d=c;
	for(int i=b.length()-1;i>=0;i--){
		c=c+b.charAt(i);
	}
	//System.out.print(c);
if(b.equals(c)){
		System.out.println("It is palindrome");
	}
	else{
		System.out.println("It is not palindrome");
	}
}
}
