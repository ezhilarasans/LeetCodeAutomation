package strings;

import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
        //Input: s = "rat", t = "car"  s = "anagram", t = "nagaram"
        //Output: false true
        System.out.println("Enter the string 1");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Enter the string 2");
        String s2=sc.nextLine();
        System.out.println("is Anagram: "+isAnagram(s1,s2));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int a[] = new int[26];
        for (char temp : s.toCharArray())
            a[temp - 'a']++;
        for (char temp : t.toCharArray()) {
            if(a[temp - 'a']!=0)
                a[temp - 'a']--;
            else
                return false;
        }
        return true;
    }
}
