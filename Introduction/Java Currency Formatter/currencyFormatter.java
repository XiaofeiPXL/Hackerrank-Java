import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
         NumberFormat cf1 = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        String us  = cf1.format(payment);
        NumberFormat cf2 = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        String france  = cf2.format(payment);
        NumberFormat cf3 = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
        String china  = cf3.format(payment);
        NumberFormat cf4 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india  = cf4.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}