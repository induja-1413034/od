package Array;

import java.util.Scanner;

public class add1stlastdigit {
public static void main(String[] args){
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int e=a%10;
		String b=String.valueOf(a);
		String c=b.substring(0,1);
		int d=Integer.parseInt(c);
		System.out.println(d+e);
}
}
