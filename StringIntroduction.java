import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lex = A.compareTo(B);
        int lOfA=A.length();
        int lOfB=B.length();
        int TotL=lOfA+lOfB;
        System.out.println(TotL);
        if(lex>0){
          System.out.println("Yes");
        }
        else{
          System.out.println("No");
        }
        String str[]=new String[2];
        str[0]=A;
        str[1]=B;
        String Cap="";
       for(int i=0;i<2;i++){
          char ch =Character.toUpperCase(str[i].charAt(0));
          Cap+=ch+str[i].substring(1)+" ";
       }
       System.out.println(Cap);
    }
}
