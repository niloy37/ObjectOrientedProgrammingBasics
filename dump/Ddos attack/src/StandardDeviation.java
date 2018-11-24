//https://www.hackerrank.com/challenges/s10-standard-deviation/problem

import java.util.*;


public class StandardDeviation {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		int x=var.nextInt();
		int [] array = new int [x];
		for(int i=0;i<x;i++) {
			
			array[i]=var.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<x;i++) {
			sum+=array[i];
		}
		
		double mean = (sum*1.0)/x;
		
		double [] arrayNew = new double [x];
		double sum1=0;
		
		for(int i=0;i<x;i++) {
			double nez = (array[i]-mean);
			arrayNew[i] = Math.pow(nez,2);
			sum1+=arrayNew[i];
		}
		double root = (sum1*1.0)/x;
		
		double rooted = Math.pow(root, 0.5);
		double deviation = (double)Math.round(rooted*10d)/10d;
		
		System.out.println(deviation);
		
		
	}

}
