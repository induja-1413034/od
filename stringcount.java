package GuviLogic;

import java.util.Scanner;

public class stringcount {
public static void main(String[] args){
	int n,count=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	String[] a=new String[n];
	for(int i=0;i<n;i++){
		a[i]=s.next();
	}
	for(int j=0;j<n;j++){
		if(a[j].length()>2){
			if(a[j].substring(0,2).contains("01")||a[j].substring(0,2).contains("10")){
				count++;
			}
		}
	}
	System.out.println(count);
}
}
