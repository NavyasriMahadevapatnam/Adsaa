//fractional knapsack using greedy method
import java.util.*;
class Item{
	int weight;
	int profit;
	double ratio;
	Item(int w,int p){
		weight=w;
		profit=p;
		ratio=(double)p/w;
        }
 }
 class Fractionknapsack{
 	public static void main(String[] args){
		int[] weight={10,20,30};
		int[] profit={60,100,120};
		int capacity=50;
		int n=weight.length;
		Item[] items=new Item[n];
		for(int i=0;i<n;i++){
			items[i]=new Item(weight[i],profit[i]);
		}
		Arrays.sort(items, (a,b) -> Double.compare(b.ratio,a.ratio));
		double totalProfit=0;
		for(int i=0;i<n;i++){
			if(capacity>=items[i].weight){
				capacity-=items[i].weight;
				totalProfit+=items[i].profit;
		        }
		        else{
		        	totalProfit+=items[i].ratio*capacity;
		        	break;
		        }
               }
               System.out.println("Maxprofit="+ totalProfit);
       }
}
