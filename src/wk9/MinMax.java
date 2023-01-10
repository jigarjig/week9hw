package wk9;
import java.util.Scanner;
public class MinMax {

    public static void main(String arg[]) {
        Scanner scan = null;
        int n = 0;
        int max = 0,min = 0;
        try {
            System.out.println("Please enter value of N: ");
            scan = new Scanner(System.in);
            n = scan.nextInt();
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            System.out.printf("Please enter %d numbers %n", n);
            for (int i = 0; i < n; i++) {
                int current = scan.nextInt();
                if (current > max) {
                    max = current;
                }else
                if (current < min) {
                    min = current;
                }
                if (current <= 0){
                    return;
                }
                else{
                  System.out.println("invalid");
                }
            break;
            }
            System.out.println("Max of N number is : " + max);
            System.out.println("Min of N number is : " + min);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            scan.close();
        }
    }
}
