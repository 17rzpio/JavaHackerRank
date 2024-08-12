


import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        int comprimentoA = a.length();
        int comprimentoB = b.length();
        
        boolean oneHaveEqual = false;
        loopExterno:
        for(int i =0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    oneHaveEqual = true;
                    String remove = String.valueOf(a.charAt(i));
                    a.replace(remove, "");
                    String remove2 = String.valueOf(b.charAt(j));
                    b.replace(remove2, "");
                    --j;
                    --i;
                    break loopExterno;
                }
            if(oneHaveEqual==false){
                return false;
            }
            else
                oneHaveEqual=false;                              
            }            
        }
        return true;
        
        
    }