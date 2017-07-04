package rou;

import java.util.Scanner;

public class stringmul {
public static void main(String[] args){
	String a;
	String b;
	Scanner s=new Scanner(System.in);
	a=s.next();
	b=s.next();
	int c=Integer.parseInt(a);
	int d=Integer.parseInt(b);
	int e=c*d;
	String f=String.valueOf(e);
	System.out.println(f);
	
}
}
