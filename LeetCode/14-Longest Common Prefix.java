import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        String first=s[0];
        String result="";
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            boolean match=true;
            for(int j=1;j<n;j++){
                if(i>=s[j].length() || s[j].charAt(i)!=ch){
                    match=false;
                    break;
                }
            }
            if(match){
                result=result+ch;
            }else{
                break;
            }
        }
        System.out.println("\""+result+"\"");
    }
}
/*======LEET CODE FORMAT=====
  class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first=strs[0];
        String result="";
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            boolean match=true;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    match=false;
                    break;
                }
            }
            if(match){
                result=result+ch;
            }else{
                break;
            }
        }
        return result;
    }
}
*/
