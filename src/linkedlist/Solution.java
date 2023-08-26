package linkedlist;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();


        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(str);
            }
            else
            {
                map.put(sortedWord,new ArrayList<>());
                //map.get(sortedWord).add(str);
            }


        }


        return  new ArrayList<>(map.values());
    }
    }
