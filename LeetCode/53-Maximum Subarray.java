import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int max=A[0];
        int sum=A[0];
        for(int i=0;i<n;i++){
          if(sum+A[i]>A[i]){
              sum=sum+A[i];
          }else{
              sum=A[i];
          }
          if(sum>max){
              max=sum;
          }
        }
        System.out.println(max);
    }
}
/*=====LEETCODE FORMAT======
  class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]>nums[i]){
                sum=sum+nums[i];
            }else{
                sum=nums[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
*/
