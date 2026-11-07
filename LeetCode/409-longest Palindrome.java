import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] countchar=new int[128];
        //[0,0,0,0,0,.....]
        for(int i=0;i<s.length();i++){
            countchar[s.charAt(i)]++;
            //[0,0,1,0,2,]
        }
        int length=0;
        boolean odd=false;
        for(int i=0;i<128;i++){
            if(countchar[i]%2==0){
                length=length+countchar[i];
            }else{
                length=length+countchar[i]-1;
                odd=true;
            }
        }
        if(odd==true){
            length=length+1;
        }
        System.out.println(length);
        
    }
}
/*======LEET CODE FORMAT=======
  class Solution {
    public int longestPalindrome(String s) {
        int[] charCount=new int[128];
        for(char c: s.toCharArray()){
            charCount[c]++;
        }
        int length=0;
        boolean odd=false;
        for(int count : charCount){
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                odd=true;
            }
        }
        if(odd==true){
            length+=1;
        }
        return length;
    }
}
*/
