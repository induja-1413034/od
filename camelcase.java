package rou;
import java.util.Scanner;
public class camelcase {
	public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
	        String a = s.nextLine();
	        String result = "";
	        char firstChar = a.charAt(0);
	        result = result + Character.toUpperCase(firstChar);
	        for (int i = 1; i < a.length(); i++) {
	            char currentChar = a.charAt(i);
	            char previousChar = a.charAt(i - 1);
	            if (previousChar == ' ') {
	                result = result + Character.toUpperCase(currentChar);
	            } else {
	                result = result + currentChar;
	            }
	        }
	        System.out.println(result);
		
	}
}
