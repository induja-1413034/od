package Strings;

import java.util.Scanner;

public class hunterlogic {
public static void main(String[] args){
	String a,b;
	Scanner s=new Scanner(System.in);
	a=s.next();
	b=s.next();
	if(a.contains(b)){
		System.out.println(a.indexOf(b));
	}
}
}
