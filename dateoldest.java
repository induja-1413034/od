package Array;

import java.util.Scanner;

public class dateoldest {
public static void main(String[] args){
	String a;
	String b;
	Scanner s=new Scanner(System.in);
	a=s.next();
	b=s.next();
String c=a.substring(6);
String d=a.substring(6);
int e=Integer.parseInt(c);
int f=Integer.parseInt(d);
if(e>f){
	System.out.println(a.substring(3,5)+"/"+a.substring(0,2)+"/"+e);
}
else{
	System.out.println(b.substring(3,5)+"/"+b.substring(0,2)+"/"+f);
}
}
}
