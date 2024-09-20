package starPattern;

public class invertedPyramidStar {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){//starts from high to low stars. current row
            for(int j=i;j>=0;j--)
                System.out.print(" ");// 0 to current row
            for(int k=i;k<5;k++)
                System.out.print("* ");//current row to total row
            System.out.println();
        }
    }
}
