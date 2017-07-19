package guviprgms;

import java.util.Scanner;

public class ampm {
public static void main(String[] args){
	String a;
	Scanner s=new Scanner(System.in);
	a=s.nextLine();
	if(a.contains("am")||a.contains("pm")){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
}
}
