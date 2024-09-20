package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        //Input: s = "()[]{}"  "(]"  "([])"
        //Output: true false true
        System.out.println("enter the parenthesis string: ");
        String input=new Scanner(System.in).nextLine();
        System.out.println(isValidParentheses(input));


    }
    private static boolean isValidParentheses(String input){
        HashMap<Character,Character> hmap=new LinkedHashMap<>();
        Stack<Character> sc=new Stack<Character>();
        hmap.put('(',')');
        hmap.put('[',']');
        hmap.put('{','}');
        for(char c:input.toCharArray()){
            if(hmap.containsKey(c))
                sc.push(c);
            else if(hmap.containsValue(c)){
                if(!sc.isEmpty()&&hmap.get(sc.peek())==c)
                    sc.pop();
                else
                    return false;
            }

        }
        return sc.empty();
    }
}
