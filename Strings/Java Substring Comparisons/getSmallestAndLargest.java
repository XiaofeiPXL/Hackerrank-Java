import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        java.util.List<String> list = new java.util.LinkedList<String>();
        for(int i=0;i+k<=s.length();i++) {
            String subString = s.substring(i,i+k);
            list.add(subString);
        }
        String[] arr = new String[list.size()];
        for(int i=0;i<list.size();i++) {
            arr[i] = list.get(i);
        }
        java.util.Arrays.sort(arr);
        smallest = arr[0];
        largest = arr[list.size()-1];
        
        return smallest + "\n" + largest;
    }

