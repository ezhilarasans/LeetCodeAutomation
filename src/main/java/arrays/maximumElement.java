package arrays;

import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Number of elements ");
        int numberOfElements = sc.nextInt();
        int elements[] = new int[numberOfElements];
        System.out.println(" Enter the elements ");
        for (int i = 0; i < numberOfElements; i++)
            elements[i] = sc.nextInt();
        System.out.println("Maximum of elements " + maxElement(elements));
    }

    private static int maxElement(int[] element) {
        int maxElement = element[0];
        for (int i = 1; i < element.length; i++) {
            maxElement=Math.max(maxElement,element[i]);
        }
        return maxElement;
    }
}