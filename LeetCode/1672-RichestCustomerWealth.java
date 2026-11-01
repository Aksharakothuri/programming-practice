import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    int[][] A=new int[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            A[i][j]=sc.nextInt();
	        }
	    }
	    int max=0;
	    for(int i=0;i<m;i++){
	        int sum=0;
	        for(int j=0;j<n;j++){
	            sum=sum+A[i][j];
	        }
	        if(sum>max){
	            max=sum;
	        }
	    }
	    System.out.println(max);
	}
}
