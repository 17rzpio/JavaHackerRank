
//java 8

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
        NumberFormat formattedPayment=NumberFormat.getCurrencyInstance(Locale.US);
        String us = formattedPayment.format(payment);
        
        formattedPayment=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formattedPayment.format(payment).replace("\u20B9","Rs.");
        
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.CHINA);     
        String china = formattedPayment.format(payment).replace("\u00a5","\uFFE5");
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        String france = formattedPayment.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}