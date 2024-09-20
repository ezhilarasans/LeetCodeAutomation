package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOfLetter {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        String input = new Scanner(System.in).nextLine();
        countOfLetter(input);
    }

    private static void countOfLetter(String input) {
        Map<Character, Integer> resultList = new HashMap<>();
        for (char c : input.toCharArray())
            resultList.put(c, resultList.getOrDefault(c, 0) + 1);
        for (Map.Entry hmap : resultList.entrySet())
            System.out.println(" " + hmap.getKey() + " : " + hmap.getValue());


    }
}
