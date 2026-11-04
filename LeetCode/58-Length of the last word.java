import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else if(count>0){
                break;
            }
        }
        System.out.println(count);
    }
}
/*======ANOTHER WAY======
  import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s.trim();
        String[] str=s.split(" ");
        System.out.println(str[str.length-1].length());
    }
}
*/
/*=======LEET CODE FORMAT========
  class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if(count>0){
                break;
            }
        }
        return count;
    }
}
*/
