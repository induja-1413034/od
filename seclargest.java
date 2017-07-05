package rou;
import java.util.Scanner;
import java.util.Arrays;
public class seclargest {
public static void main(String[] args){
	int[] array=new int[5];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++){
		array[i]=s.nextInt();
	}
	Arrays.sort(array);
	int max2=array[1];
	System.out.println(max2);
}
}
