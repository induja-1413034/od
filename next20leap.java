package GuviLogic;

import java.util.Scanner;

public class next20leap {
public static void main(String[] args){
	int a,c=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(int i=a;i<=a+100;i++){
		if(i%4==0){
			c++;
				System.out.println(i);
		}
		if(c>20){
			break;
		}
		}
}
}