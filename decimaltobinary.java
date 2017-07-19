package guviprgms;

import java.util.Scanner;

public class decimaltobinary {
public static void main(String[] args){
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	String b=Integer.toBinaryString(a);
	String c=Integer.toOctalString(a);
	String d=Integer.toHexString(a);
	int e=Integer.valueOf(b);
	int f=Integer.valueOf(c);
	//int g=Integer.valueOf(d);
	System.out.println("The binary number is"+e);
	System.out.println("The octal number is"+f);
	System.out.println("The hexadecimal number is"+d);
}
}
