import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println(lengthA + lengthB);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        A = upperSymbol(A);
        B = upperSymbol(B);
        System.out.println(A + " " + B);
        sc.close();
    }

    public static String upperSymbol(String s) {
        char[] arr = s.toCharArray();
        arr[0] -= 32;
        return String.valueOf(arr);
    }
}



