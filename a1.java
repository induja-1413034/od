package GuviLogic;

import java.util.Scanner;

public class a1 {
public static void main(String[] args){
	int n;
	int k;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	k=s.nextInt();
	int[] a=new int[n];
	int[] ab=new int[n];
	for(int i=0;i<n;i++){
	a[i]=s.nextInt();	
	}
	for(int i=0;i<n;i++){
	 ab[i]=a[i]-k;
	 if(ab[i]<=0){
		 ab[i]=ab[i]+n;
		 System.out.print(ab[i]);
	 }
	 else{
		 System.out.print(ab[i]);
	 }
	}
}
}
