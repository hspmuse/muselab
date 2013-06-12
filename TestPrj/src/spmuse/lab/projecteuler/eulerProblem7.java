package spmuse.lab.projecteuler;

public class eulerProblem7 {

	public static void main(String [] args){
		
		int i=2;
		int end=2;
		int cnt = 0;
		Boolean f = true;
		while(f) {
			
			for(i=2;i<=end;i++) {
				if( i%2 == 0 && i != 2 ) {
					System.out.println(i);
				}
				
			}
			end++;
			if(end == 100) break;
		}
		
	}
}
