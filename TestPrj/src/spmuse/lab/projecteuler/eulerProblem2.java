package spmuse.lab.projecteuler;

public class eulerProblem2 {

	public static void main(String [] args){
	
		int i = 1, j = 2;
		
		int fibo = 0;
		int evensum = 2;
		
		while(fibo<4000000) {
			
			fibo = i+j;
			i=j;
			j=fibo;
			
			if(fibo%2 == 0) evensum = evensum + fibo;
		}
		
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("evensum=" + evensum);
		
	}
}
