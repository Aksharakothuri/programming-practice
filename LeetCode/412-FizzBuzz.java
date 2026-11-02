import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=1;i<=n;i++){
            if(i%15==0){
               System.out.println("FizzBuzz");
            }else if(i%5==0){
               System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
        
    }
}
/*=======LEETCODE FORMAT=========
  class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr=new String[n];
        for(int i=1;i<=n;i++){
            if(i%15==0){
                arr[i-1]="FizzBuzz";
            }else if(i%5==0){
                arr[i-1]="Buzz";
            }else if(i%3==0){
                arr[i-1]="Fizz";
            }else{
                arr[i-1]=String.valueOf(i);
            }
        }
        return Arrays.asList(arr);
    }
}*/
