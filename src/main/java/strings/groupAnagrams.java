package strings;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        //Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for(String s:strs){
            char[] temp=s.toCharArray();
            Arrays.sort(temp);
            String newValue=String.valueOf(temp);
            if(!ans.containsKey(newValue))
                ans.put(newValue,new ArrayList<>());
            ans.get(newValue).add(s);
        }
        return new ArrayList(ans.values());
    }
}
