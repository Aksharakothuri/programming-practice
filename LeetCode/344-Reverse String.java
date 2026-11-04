import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char[] a=s.toCharArray();
        System.out.print("[");
        for(int i=n-1;i>=0;i--){
            System.out.print("\""+a[i]+"\"");
        if(i>0){
            System.out.print(",");
        }
    }
        System.out.println("]");
    }
}
/*======LEET CODE FORMAT=====
  class Solution {
    public void reverseString(char[] s) {
        char[] a=s.clone();
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            s[j]=a[i];
        }   
    }
  */
}
  
