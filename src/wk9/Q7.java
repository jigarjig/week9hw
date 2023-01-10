// 7. Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
//17... are the prime numbers.)
package wk9;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        //int num = 3;
        boolean right = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                right = true;
                break;
            }
        }

        if (!right)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

