package starPattern;

public class pyramidStar {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){//current row.starts from low to high stars.

            for (int j = 5; j  >  i; j--) {// total row to current row
                System.out.print(" ");
            }
            for (int k = 0; k  <= i; k++) {// 0 to current row
                System.out.print("* ");//printing stars. the same of i.
            }
            System.out.println();
    }
}
}
/*
      *
     * *
    * * *
   * * * *
  * * * * *
 */