package strings;

import java.util.Scanner;

public class reverseStringByEachWord {
    public static void main(String[] args) {
        System.out.println("Enter the word: ");
        String input=new Scanner(System.in).nextLine();
        System.out.println(reverseByWord(input));

    }

    private static String reverseByWord(String input) {
        String splitByWord[] = input.split(" ");
        StringBuffer result = new StringBuffer();
        for (String word : splitByWord)
            result.append(reverseAString.reverseString(word) + " ");
        return String.valueOf(result).trim();

    }

}
