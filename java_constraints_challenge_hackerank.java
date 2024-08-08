/*Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int B;
        int H;
        Scanner n = new Scanner(System.in);
        try {
            B = n.nextInt();
            H = n.nextInt();
            if (B <= 0 || H <=0)
                throw new Exception("Breadth and height must be positive");
            else
                System.out.println(B*H); 
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);
            }
    }
}
