import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        test(s);
        cin.close();
    }

    public static void token(String s) {
        String[] a = s.trim().split("[ !,?\\._'@]+");
        //System.out.println(a.length);
        if (a.length == 1 && a[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(a.length);
            for (String x : a)
                System.out.println(x);
        }
    }
}

