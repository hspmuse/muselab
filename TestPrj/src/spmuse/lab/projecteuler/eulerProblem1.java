package spmuse.lab.projecteuler;

public class eulerProblem1 {
	
	public static void main(String [] args){
		
		int i=1, j=1, k=1;
		int th = 0, fi=0, du=0;
		
		while(3*i<1000) {
			th = th + 3*i++;
			if(5*j<1000) fi=fi+5*j++;
			
			if(15*k<1000) du=du+(3*5)*k++;
			System.out.println("th=" + th);
			System.out.println("fi=" + fi);
			System.out.println("du=" + du);
		}
		
		//System.out.println("th=" + th);
		//System.out.println("fi=" + fi);
		System.out.println("total=" + (th+fi-du));
		
	}
	
}
