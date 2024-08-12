
import java.io.*;
import java.util.*;
import java.text.*;
public class Solution {

    public static void main(String[] args)  throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Double payment;    
        Scanner reader = new Scanner(System.in);
        payment = reader.nextDouble();
        NumberFormat formattedPayment=NumberFormat.getCurrencyInstance(Locale.US);
        String u = formattedPayment.format(payment);
        
        formattedPayment=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String i = formattedPayment.format(payment).replace("\u20B9","Rs.");
        
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.CHINA);     
        String c = formattedPayment.format(payment).replace("\u00a5","\uFFE5");
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        String f = formattedPayment.format(payment);
        
        System.out.println("US: "+u);
        System.out.println("India: "+i);
        System.out.println("China: "+c);
        System.out.println("France: "+f);
    }
}
