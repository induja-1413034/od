package GuviLogic;

import java.util.Scanner;

public class swapoddevencharacter {
public static void main(String[] args){
	String a;
	String b="true";
	String c="false";
	Scanner s=new Scanner(System.in);
	a=s.next();
	if(a.equalsIgnoreCase("Monday")||a.equalsIgnoreCase("Tuesday")||a.equalsIgnoreCase("Tuesday")||a.equalsIgnoreCase("Wednesday")||a.equalsIgnoreCase("Thursday")||a.equalsIgnoreCase("Friday")){
		System.out.println(b);
}
	else if(a.equalsIgnoreCase("Saturday")||a.equalsIgnoreCase("Sunday")){
		System.out.println(c);
	}
	else{
		System.out.println("Invalid day");
	}
}
}
