package Test.codes;
//3. Write a Java program to print a right-angled triangle of stars. The number of rows should be taken as input.
import java.util.Scanner;

public class RightAngleTrianglePattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}

/*OUTPUT :-
Enter the number of rows: 5

*
**
***
****
*****

*/