//0/1 Knapsack problem using dynamic programming
import java.util.*;
public class Knapsack{
	public static int Knapsack(int[] weights,int[] values,int n,int W){
		int[][] dp=new int[n+1][W+1];
		for(int i=0;i<=n;i++){
			for(int w=0;w<=W;w++){
				if(i==0 || w==0){
					dp[i][w]=0;
				}
				else if(weights[i-1]<=w){
					dp[i][w]=Math.max(dp[i-1][w],values[i-1]+dp[i-1][w-weights[i-1]]);
				}
				else{
					dp[i][w]=dp[i-1][w];
				}
			}
		}
		return dp[n][W];
	}
	public static void main(String[] args){
		int[] weights={10,40,30,20};
		int[] values={25,10,15,18};
		int W=50;
		int n=weights.length;
		int maxV=Knapsack(weights,values,n,W);
		System.out.println("Maximum value"+maxV);
	}
}
