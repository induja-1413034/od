package guviprgms;

import java.util.Scanner;

public class strlength {
public static void main(String[] args){
	String a;
	String b;
	Scanner s=new Scanner(System.in);
	a=s.next();
	b=s.next();
	int c=a.length();
	int d=b.length();
	int e=a.length()-b.length();
	if(c==d){
		System.out.println(a+b);	
	}
	else if(c>d){
		System.out.println(a.substring(e)+b);
	}
}
}
