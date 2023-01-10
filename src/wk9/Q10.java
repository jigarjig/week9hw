package wk9;

public class Q10 {
    public static void StarleftTriangle(int j)
    {
        int a, b;
        for (a = 0; a < j; a++) {
            for (b = 2 * (j - a); b >= 0; b--) {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int j = 5;
        StarleftTriangle(j);
    }
}

