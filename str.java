package GuviLogic;

import java.util.Scanner;

public class str {
public static void main(String[] args){
	String a;
	String b;
	String g="";
	int e,f;
	String i;
	Scanner s=new Scanner(System.in);
	a=s.next();
	b=s.next();
	System.out.println("Enter the pin number:");
	e=s.nextInt();
	i=String.valueOf(e);
	System.out.println("Enter the N value:");
	f=s.nextInt();
	String c="";
	String d="";
	if(a.length()==b.length()){
		if(a.charAt(0)>b.charAt(0)){
			c=a;
			d=b;
		}else{
			c=b;
			d=a;
		}
	}
	else if(a.length()>b.length()){
		c=a;
		d=b;
	}
	else{
		c=b;
		d=a;
	}
	g=c.substring(0,1)+d+i.substring(f-1,f)+i.substring(0,1);
	System.out.print(g);
}
}
