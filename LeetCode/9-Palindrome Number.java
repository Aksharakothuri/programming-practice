class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int reverse=0;
        int r;
        while(x>0){
            r=x%10;
            reverse=(reverse*10)+r;
            x=x/10;
        }
        if(reverse==temp){
            return true;
        }else{
            return false;
        }
    }
}
/*=====NORMAL CODE FORMAT========
  import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int r;
        int reverse=0;
        while(n>0){
            r=n%10;
            reverse=(reverse*10)+r;
            n=n/10;
        }
        if(reverse==temp){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}*/
