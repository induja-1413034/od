package GuviPrgms;

	import java.util.Scanner;

	public class bin {
		public static void mian(String[] args){
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	String b=Integer.toBinaryString(a);
	int c=Integer.parseInt(b);
	System.out.println(c);

	}

}
