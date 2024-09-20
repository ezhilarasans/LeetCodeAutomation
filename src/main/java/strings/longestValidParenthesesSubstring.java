package strings;

public class longestValidParenthesesSubstring {
    public static void main(String[] args) {
        String input = "()())(())()";//6
        String input1 = ")()()";//4
        String input2 = "()()()(((((()()";//6
        String input3 = "(()((()((((";//2
        System.out.println("  length of largest balanced substring " + largestSubString(input2));
    }

    private static int largestSubString(String input) {
        // Left to Right Traversal
        //Left to right traversal ensures that every valid substring
        // that ends at the rightmost closing parenthesis is counted.
        int open = 0, close = 0, maxlen = 0;
        for (char c : input.toCharArray()) {
            if (c == '(')
                open++;
            else if (c == ')')
                close++;
            if (open == close)
                maxlen = Math.max(maxlen, 2 * close);
            else if (open < close)
                open = close = 0;
        }
        // Right to Left Traversal
        //Right to left traversal ensures that every valid substring
        // that starts from the leftmost opening parenthesis is counted.
        open = close = 0;
        for (int i=input.length()-1;i>0;i--) {//last input depends on this.
            if (input.charAt(i) == '(')
                open++;
            else if (input.charAt(i) == ')')
                close++;
            if (open == close)
                maxlen = Math.max(maxlen, 2 * open);
            else if (open > close)
                open = close = 0;
        }
        return maxlen;
    }

}
