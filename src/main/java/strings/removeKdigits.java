package strings;

import java.util.LinkedList;
import java.util.Scanner;

public class removeKdigits {
    public static void main(String[] args) {
        //Given string num representing a non-negative integer num, and an integer k,
        // return the smallest possible integer after removing k digits from num.
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println("Enter the digits: ");
        int digits = sc.nextInt();
        System.out.println(removeKdigits(number,digits));
    }

    private static String removeKdigits(String num, int k) {
        //Input: num = "1432219", k = 3
        //Output: "1219"
        if (num.length() <= k)
            return "0";
        LinkedList<Character> cands = new LinkedList<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (cands.size() > 0 && c < cands.peekLast() && k > 0) {
                cands.pollLast();
                k--;
            }
            cands.add(c);
        }
        while (k > 0) {
            cands.pollLast();
            k--;
        }
        while (cands.size() > 0 && cands.peekFirst() == '0')
            cands.pollFirst();
        if (cands.size() == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while (cands.size() > 0)
            sb.append(cands.pollFirst());
        return sb.toString();
    }
}
