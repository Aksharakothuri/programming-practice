import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String t=sc.nextLine();
       int result=-1;
       for(int i=0;i<=s.length()-t.length();i++){
           boolean match=true;
           for(int j=0;j<t.length();j++){
               char ch=t.charAt(j);
               if(ch!=s.charAt(i+j)){
                   match=false;
                   break;
               }
           }
           if(match){
               result=i;
               break;
           }
       }
          System.out.println(result); 
      }
    }
/*======LEET CODE FORMAT=======
  class Solution {
    public int strStr(String haystack, String needle) {
        int result=-1;
        int j;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            
            for( j=0;j<needle.length();j++){
                
                if(haystack.charAt(i+j)!=needle.charAt(j)){

                    break;
                }
            }
            if(j==needle.length()){
               return i;
            }
        }
        return -1;
    }
}
*/
