// 8. Display left angle triangle of * using nested for loops
//*
//* *
//* * *
//* * * *
//* * * * *
package wk9;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Display Right angle triangle * :");

        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}

