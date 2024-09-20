package strings;

import java.util.Scanner;

public class IndexForFirstOccurrence {
    public static void main(String[] args) {
        //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
        //i:p haystack: "mississippi"  needle: "issip" o/p:4
        System.out.println("Enter the haystack: ");
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        System.out.println("Enter the needle: ");
        String needle = sc.nextLine();
        System.out.println(indexOfFirstOccurrence(haystack, needle));

    }

    private static int indexOfFirstOccurrence(String haystack, String needle) {
        int hl=haystack.length();
        int nl= needle.length();
        for (int j = 0; j <= hl-nl; j++) {
            int needles=0;
            while(needles<nl&&needle.charAt(needles)==haystack.charAt(j+needles))
                needles++;
            if(needles==nl)
                return j;
        }
        return -1;

    }
}
