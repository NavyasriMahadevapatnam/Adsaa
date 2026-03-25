//Travelling sales person problem
import java.util.*;
public class Tsp{
	static int n=4;
	static int[][] dist={
		{0,10,15,20},
		{5,0,9,10},
		{6,13,0,12},
		{8,8,9,0}
	};
	static boolean[] visited;
	static int finalRes=Integar.MAX_VALUE;
	static List<Integer> finalPath=new ArrayList<>();
	static void tsp(int
