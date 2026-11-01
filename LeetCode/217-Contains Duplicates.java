import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        boolean b=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]==A[j]){
                    b=true;
                }
            }
        }
        System.out.println(b);
    }
}
/*=====LEET CODE FORMAT=====
  class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
*/
