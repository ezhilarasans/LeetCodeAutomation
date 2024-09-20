package arrays;

import java.util.Scanner;

public class secondMaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Number of elements ");
        int numberOfElements = sc.nextInt();
        int elements[] = new int[numberOfElements];
        System.out.println(" Enter the elements ");
        for (int i = 0; i < numberOfElements; i++)
            elements[i] = sc.nextInt();
        System.out.println("Maximum of elements " + secondMaxElement(elements));
    }

    private static int secondMaxElement(int[] element) {
        int maxElement = element[0];
        int secondMaxElement = element[0];
        for (int i = 1; i < element.length; i++) {
            if (maxElement < element[i]) {//first max
                secondMaxElement = maxElement;
                maxElement = Math.max(maxElement, element[i]);
            }
            else if (element[i] > secondMaxElement && element[i] != maxElement) {
                secondMaxElement = element[i];
            }
        }
        return secondMaxElement;
    }
}
