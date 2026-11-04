import java.util.*;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(s.length()!=t.length()){
           System.out.println("false");
        }
        else{
            char[] a=s.toCharArray();
            char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
      if (Arrays.equals(a,b)){
          System.out.println("true");
      }else{
          System.out.println("false");
      }
        }     
    }
}
/*=======LEET CODE FORMAT=======
  import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
            char[] a=s.toCharArray();
            char[] b=t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a,b);   
    }
}
*/
