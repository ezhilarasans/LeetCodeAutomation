package starPattern;

public class butterflyStar {
    public static void main(String[] args) {
        int size = 5;
        //Left side of butterfly
        for (int i = 1; i <= size; ++i) {//current row
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            int spaces=(2*size)-(2*i);
            for(int j=1;j<=spaces;j++)
                System.out.print(" ");
            //Right side of butterfly
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
                int spaces=(2*size)-(2*i);
                for(int k=1;k<=spaces;k++)
                    System.out.print(" ");
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }