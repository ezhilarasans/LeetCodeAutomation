package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class allAnagramsinAString {//sliding window
    public static void main(String[] args) {
        //Given two strings s and p, return an array of all the start indices of p's
        //anagrams in s. You may return the answer in any order.
        //Input: s = "cbaebabacd", p = "abc"
        // Output: [0,6]
        System.out.println("Enter the string 1");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the string 2");
        String p = sc.nextLine();
        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return rst;
        }

        int[] map_s = new int[26];
        int[] map_p = new int[26];

        for (int i = 0; i < p.length(); i++) {//second string which needs to use
            map_p[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {//first string, fill only the first p places
            map_s[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length(); i++) {//considering only s-p places
            if (isMatch(map_p, map_s))
                rst.add(i);
            map_s[s.charAt(i+p.length())-'a']++;
            map_s[s.charAt(i)-'a']--;
        }
        if (isMatch(map_p, map_s))
            rst.add(s.length()-p.length());
        return rst;
    }
    public static boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}