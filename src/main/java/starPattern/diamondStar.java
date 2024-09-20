package starPattern;

public class diamondStar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i  <  n; i++) {//same as pyramid star
            // Print spaces
            for (int j = n; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i  <  n; i++) {//same as inverted pyramid star
            // Print spaces
            for (int j = i; j >=0; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = i; k < n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
