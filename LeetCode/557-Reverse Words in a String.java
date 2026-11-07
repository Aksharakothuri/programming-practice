class Solution {
    public String reverseWords(String s) {
      char[] chars=s.toCharArray();
      int left=0;
      int right=0;
      for(right=0;right<=chars.length;right++){
        if(right==chars.length||chars[right]==' '){
            reverse(chars,left,right-1);
            left=right+1;
        }
      }
      return new String(chars);
    }
    private void reverse(char[] chars,int left,int right){
        while(left<right){
            char temp=chars[left];
            chars[left++]=chars[right];
            chars[right--]=temp;
        }
    }
}
/*
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            String c=words[i];
            for(int j=c.length()-1;j>=0;j--){
                System.out.print(c.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
*/
