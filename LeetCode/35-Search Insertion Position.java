import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                System.out.println(i);
            }
        }
    }
}
/*=====LEET CODE FORMAT======
  lass Solution {
    public int searchInsert(int[] nums, int target) {
        int result;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
*/
