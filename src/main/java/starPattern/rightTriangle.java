package starPattern;

public class rightTriangle {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){//low to high
            for(int j=0;j<=i;j++){ //current row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
