package starPattern;

public class hollowPyramidStar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            //printing leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print the first and last rows- it is having own row number of stars.
            if (i == 0 || i == n - 1) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
            } else {
                // Print the first asterisk
                System.out.print("* ");

                // Print spaces inside the pyramid
                for (int k = 1; k < i; k++) {
                    System.out.print("  ");
                }

                // Print the second asterisk
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
