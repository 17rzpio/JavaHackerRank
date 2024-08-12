
import java.io.*;
import java.util.*;
import java.text.*;
public class Solution {

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double payment;    
        Scanner reader = new Scanner(System.in);
        payment = reader.nextDouble();
        
        NumberFormat formattedPayment=NumberFormat.getCurrencyInstance(Locale.US);
        FieldPosition pos = new FieldPosition(NumberFormat.FRACTION_FIELD);
        StringBuffer dest1 = new StringBuffer("US: ");
        String u = formattedPayment.format(payment,dest1,pos).toString();
        
        formattedPayment=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        StringBuffer dest2 = new StringBuffer("India: ");
        String i = formattedPayment.format(payment,dest2,pos).toString().replace("\u20B9","Rs.");;
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.CHINA); 
        StringBuffer dest3 = new StringBuffer("China: ");
        String c = formattedPayment.format(payment,dest3,pos).toString().replace("\u00a5","\uFFE5");
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        StringBuffer dest4 = new StringBuffer("France: "); 
        String f = formattedPayment.format(payment,dest4,pos).toString();
        
        System.out.println(u);
        System.out.println(i);
        System.out.println(c);
        System.out.println(f);
    }
}

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double payment;    
        Scanner reader = new Scanner(System.in);
        payment = reader.nextDouble();
        
        NumberFormat formattedPayment=NumberFormat.getCurrencyInstance(Locale.US);
        FieldPosition pos = new FieldPosition(NumberFormat.FRACTION_FIELD);
        StringBuffer dest1 = new StringBuffer("US: ");
        StringBuffer u = formattedPayment.format(payment,dest1,pos);
        
        formattedPayment=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        StringBuffer dest2 = new StringBuffer("India: ");
        StringBuffer i = formattedPayment.format(payment,dest2,pos).replace(7,8,"Rs.");;
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.CHINA); 
        StringBuffer dest3 = new StringBuffer("China: ");
        StringBuffer c = formattedPayment.format(payment,dest3,pos).replace(7,8,"\uFFE5");
        
        formattedPayment=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        StringBuffer dest4 = new StringBuffer("France: "); 
        StringBuffer f = formattedPayment.format(payment,dest4,pos);
        
        System.out.println(u);
        System.out.println(i);
        System.out.println(c);
        System.out.println(f);
    }
}
