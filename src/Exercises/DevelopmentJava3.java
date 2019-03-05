package Exercises;

import java.util.Scanner;

public class DevelopmentJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word1, word2, word3;
		System.out.println("Enter First word: ");
        word1 = sc.next();
        
        System.out.println('\n'+"Enter Second word: ");
        word2 = sc.next();
		CompareString(word1, word2);
		
		System.out.println('\n'+"Enter the word to check if it is greater than 4: ");
        word3 = sc.next();
        CheckLenght(word3);
		//Use functionality from (A) in a new method from (B).
        ClassB.CheckLenght(word3);
        //Create an interface.
        //Create an interface. mplement the interface in Class (B).
        ClassB inter = new ClassB();
        inter.PrintMessage();
        //Create a method that orders by desc and asc order based on a parameter.
        ClassB OrderDcsAcs = new ClassB();
        OrderDcsAcs.Orders();
        //Create a method that removes null values
        OrderDcsAcs.RemoveNulls();
        //Create a method that gives the missing number in 1 - 10.
        OrderDcsAcs.MissingNumbers();
        
		
	}
	

	public static void CompareString(String word1, String word2) {
		if( word1.equals(word2)) {
        	System.out.println('\n'+"The two words are the same ");
        }
		else {
			System.out.println('\n'+"The words are not the same");
		}
		

	}
	public static void CheckLenght(String word3) {
		char[] a= word3.toCharArray();
		int len1=a.length;
		System.out.println('\n'+"The length of a string " + a.length);
		
		if(a.length>4) {
			System.out.println('\n'+"The word is greater than 4 " + word3);
		}
		else {
			 for(int i=0; i<len1; i++) {
				 
		        	System.out.println(a[i]);

			        
		 }
		}
			
	}

}
