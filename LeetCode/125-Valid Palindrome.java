import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String original="";
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                original=original+ch;
                rev=ch+rev;
            }
        }
        if(original.equals(rev)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
/*========LEET CODE FORMAT========
  class Solution {
    public boolean isPalindrome(String s) {
       String str= s.toLowerCase();
        String original="";
        String rev="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                original=original+ch;
                rev=ch+rev;
            }
        }
        if(original.equals(rev)){
            return true;
        }else{
            return false;
        }
    
    }
}

*/
