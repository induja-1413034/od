package Array;

import java.util.Scanner;

public class oddsum {
public static void main(String[] args){
	int a,sum=0;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	for(int i=1;i<=a;i++){
		if(i%2!=0){
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
