import java.io.*;
import java.util.*;
import java.text.*;
public class Solution {

    public static void main(String[] args)  throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Double value;
        String n = br.readLine();
        value = Double.parseDouble(n);
        bufferedWriter.write("US: "+DecimalFormat.getCurrencyInstance(Locale.US).format(value));
        bufferedWriter.newLine();
        bufferedWriter.write("India: "+DecimalFormat.getCurrencyInstance(Locale.US).format(value).replace("$","Rs."));
        bufferedWriter.newLine();
        
        NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.CHINA);     
        bufferedWriter.write("China: "+DecimalFormat.getCurrencyInstance(Locale.CHINA).format(value).replace("\u00a5","\uFFE5"));
        bufferedWriter.newLine();
        bufferedWriter.write("France: "+DecimalFormat.getCurrencyInstance(Locale.FRANCE).format(value));
        
        bufferedWriter.close();
    }
}