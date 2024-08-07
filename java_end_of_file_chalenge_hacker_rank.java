/*The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner n = new Scanner(System.in);
        int count=0;
        char A = 0x0D;
        List<String> array = new ArrayList<String>();
        array.add(n.nextLine());
        String j;
        String k;
        while(n.hasNext()){
            count++;
            j = n.nextLine();
            /*k=j;
            //while(!k.contains(Character.toString(A))){
            while(n.hasNext()){
                k = n.nextLine();
                j = j + " " + k;
                if(k.contains(Character.toString('\n')))
                    break;
            }
                */
            array.add(j);
           
        }
        int count2=1;
        for(String x:array){
            
            System.out.println(count2+" "+x);
            count2++;                
        }
        
            
    }
}
