//Implementing Job Sequencing with deadlines using Greedy method
import java.util.*;
class Job{
	int id;
	int deadline;
	int profit;
	Job(int id,int deadline,int profit){
		this.id=id;
		this.deadline=deadline;
		this.profit=profit;
	}
}
public class JobSequencing{
	public static void scheduleJobs( Job[] jobs){
		Arrays.sort(jobs,(a,b)->b.profit-a.profit);
		int max=0;
		for(Job i:jobs){
			if(i.deadline>max){
			max=i.deadline;
		}
	}
	boolean[] slot=new boolean[max];
	int[] result=new int[max];
	int tp=0;
	for(Job i:jobs){
		for(int j=Math.min(max,i.deadline)-1;j>=0;j--){
			if(!slot[j]){
				slot[j]=true;
				result[j]=i.id;
				tp=tp+i.profit;
				break;
			}
		}
	}
	System.out.println("Scheduled jobs:");
	for(int i=0;i<max;i++){
		if(!slot[i]){
			System.out.println("Job"+result[i]+" ");
		}
		
	}
	System.out.println("Total profit"+tp);
	}
	public static void main(String[] args){
		Job[] jobs={
			new Job(1,2,100),
			new Job(2,1,19),
			new Job(3,2,27),
			new Job(4,1,25),
			new Job(5,3,15)
		};
		scheduleJobs(jobs);
	}
}
		
