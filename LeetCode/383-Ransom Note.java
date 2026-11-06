import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[(int)s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            freq2[(int)t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]){
                System.out.println("false");
                break;
            }else{
                System.out.println("True");
                break;
            }
        }
    }
}
/*======LEET CODE FORMAT=======
  class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            freq1[(int)ransomNote.charAt(i)-97]++;
        }
        for(int i=0;i<magazine.length();i++){
            freq2[(int)magazine.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]){
                return false;
            }
        }
        return true;
    }
}*/
