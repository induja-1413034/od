package rou;
import java.util.Scanner;
public class simpleinterest {
public static void main(String[] args){
	float principal;
	float noOfYears;
	float rateOfInterest;
	float simpleInterest;
	Scanner s=new Scanner(System.in);
	principal=s.nextFloat();
	noOfYears=s.nextFloat();
	rateOfInterest=s.nextFloat();
	simpleInterest=(principal*noOfYears*rateOfInterest)/100;
	System.out.println(simpleInterest);
}
}
