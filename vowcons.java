package GuviLogic;

import java.util.Scanner;

public class vowcons {
public static void main(String[] args){
	String a;
	String b="";
	String c="";
	String d;
	Scanner s=new Scanner(System.in);
	a=s.next();
	for(int i=0;i<=a.length()-1;i++){
		if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
			b=b+a.charAt(i);
		}
		else{
			c=c+a.charAt(i);
		}
	}
	System.out.println(b+c);
}
}
