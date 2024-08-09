/*You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.*/
 
 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        try{
            String b = Integer.toString(a);
            System.out.println("Good job");    
        }
        catch(Exception e){
            System.out.println("Wrong answer");
        }
        
    }
}
