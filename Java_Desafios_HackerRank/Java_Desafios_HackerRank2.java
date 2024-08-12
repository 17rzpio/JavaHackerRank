/*
java string rever se 
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int j;
        boolean palindrome=true;
        if(A.length()%2==0){
            j=A.length()-1;
            for(int i=0;i<A.length()/2;++i){
                if(A.charAt(i)!=A.charAt(j)){
                    palindrome=false;
                    break;
                }
                --j;
            }
            
        }
        else{
            j=A.length()-1;
            for(int i=0;i<(A.length()/2)-1;++i){
                if(A.charAt(i)!=A.charAt(j)){
                    palindrome=false;
                    break;
                }
                --j;
            }
        }
        String palindrome2= "Yes";
        if(palindrome==false)
            palindrome2 = "No";
        System.out.println(palindrome2);
    }
}


int comprimentoA = a.length();
        int comprimentoB = b.length();
        boolean haveEqual = false;
        loopExterno:
        for(int i =0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    haveEqual = true;
                    String remove = String.valueOf(a.charAt(i));
                    a.replace(remove, "");
                    String remove2 = String.valueOf(b.charAt(j));
                    b.replace(remove2, "");
                    --j;
                    --i;
                    break loopExterno;
                }
                
                
            }
            if(haveEqual==false)
                return false;
            
        }
        return true;
        
        
    }