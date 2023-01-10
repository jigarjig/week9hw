// 2. -Read the numbers from the console entered by the user and print the
//minimumand maximum number the user has entered.
//-Before the user entersthe number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.

package wk9;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int min,max;
        System.out.println("Enter number");
        int number = sc.nextInt();
        min =max =number;

        while (i>=0){
            System.out.println(" Enter number");

            if (sc.hasNextInt()){
                sc.nextInt();
                i++;
            }
            else{
                System.out.println("Invalid number");
            break;

            }
            if (number < min) {
                min = number;
            }

            System.out.println("min number is :" +min);
            }
        if(number > max){
            max = number;
            //i++;
        }
        System.out.println("max number is :" +max);
    }
    }


