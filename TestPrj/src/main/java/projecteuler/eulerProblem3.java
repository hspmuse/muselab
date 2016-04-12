package main.java.projecteuler;

public class eulerProblem3 {

	public static void main(String [] args){
	
		int i=1;
		
		double sum1=0, sum2=0;
		int diff=0;;
		
		while(i<=100) {
			
			sum1 = sum1+Math.pow(i, 2);
			sum2 = sum2 + i;
			
			//System.out.println("i=" + i);
			//System.out.println("sum1=" + sum1);
			System.out.println("sum2=" + sum2);
			if(i==100) sum2 = Math.pow(sum2,2);
			i++;
		}
		System.out.println("sum1=" + (int)sum1);
		System.out.println("sum2=" + (int)sum2);
		diff = (int) (sum2 - sum1);
		System.out.println("diff=" + diff);
		
	}
}
