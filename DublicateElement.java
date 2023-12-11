package Test.codes;
//1. Given an array of integers, write a Java program to find and print all the duplicate elements.
public class DublicateElement {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 1 , 2 ,5};
		
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++)
             {
                if (arr[i] == arr[j])
                {
                    System.out.println("Duplicate element: " + arr[i]);
                }
             }
        }

	}

}

/*
 *OUTPUT:-
 *
Duplicate element: 1
Duplicate element: 2
Duplicate element: 5

 * */
 