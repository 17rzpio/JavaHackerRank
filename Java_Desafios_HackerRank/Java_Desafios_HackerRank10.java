
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)  throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double value;
        String n = br.readLine();
        value = Double.parseDouble(n);
        System.out.println("US: $"+String.format("%,.2f",value));
        System.out.println("India: Rs."+String.format("%,.2f",value));
        System.out.println("China: "+"\u00a5"+String.format("%,.2f",value));
        System.out.println("France: "+String.format("%,.2f",value)+" "+"\u20ac");
    }
}