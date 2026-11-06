import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[] a=s.toCharArray();
        int result=-1;
       
        for(int i=0;i<n;i++){
            int count=0;
           for(int j=0;j<n;j++){
               if(a[i]==a[j]){
                   count++;
                }
           }
           if(count==1){
               result=i;
               break;
           }
        }
        System.out.println(result);
    }
}
  
/*======LEET CODE FORMAT=======
  class Solution {
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
                if(count[s.charAt(i)-'a']==1){
                   return i;
                }
            }
            return -1;
            }
        }

*/
