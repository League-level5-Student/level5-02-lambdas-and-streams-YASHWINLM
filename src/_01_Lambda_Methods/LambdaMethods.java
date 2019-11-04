package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			char[] c=s.toCharArray();
			String S="";
			for (int i= c.length-1;i>=0;i--) {
				S+=c[i];
			}
			System.out.println(S);
			
		},"hello");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			
			Random r= new Random();
			
			String S="";
			
			for (int i = 0; i < s.length(); i++) {
				int x= r.nextInt(2);
				if(x==0) {
					S+=s.substring(i, i+1).toLowerCase();
				}
				else{
					S+=s.substring(i, i+1).toUpperCase();
					}
			}
			System.out.println(S);
		},"hello");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			String S="";
			
			for (int i = 0; i < s.length(); i++) {
				S+=s.substring(i,i+1)+".";
			}
			System.out.println(S);
			
			
		},"hello");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char []c= s.toCharArray();
			String S="";
			
			for (int i = 0; i < c.length; i++) {
				if(!(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')) {
					S+=c[i];
				}
			}
			System.out.println(S);
			
			
		},"hello");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
