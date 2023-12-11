package Test.codes;

import java.util.Arrays;
import java.util.Scanner;

//2. Write a Java function to check if two strings are anagrams of each other.
public class AnagramExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a=sc.next();
        
        System.out.print("Enter the Second string: ");
        String b=sc.next();
        
        char c[]=a.toCharArray();    
        char d[]=b.toCharArray(); 
        
        Arrays.sort(c);
        Arrays.sort(d);
        
        boolean result=Arrays.equals(c,d);
        
        if(result==true) {
        	System.out.println("Strings are equal");
        }
        else {
        	System.out.println("Strings are not equal");
        }
	}

}

/*
 *OUTPUT:-
 *Enter the first string: Nikita
Enter the Second string: sahu
Strings are not equal
 * 
 * 
 * */
 