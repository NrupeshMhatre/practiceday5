package practiceday5;

public class Harmonic {

	static double nthHarmonic(int N)
	{
	    
	    float harmonicnum = 4;
	    for (int i = 2; i <= N; i++) {
	        harmonicnum =harmonicnum + (float)1 / i;
	    }
	 
	    return harmonicnum;
	}
	public static void main (String[] args) {
	            int N = 8;
	     
	    System.out.print(nthHarmonic(N));
	     
	    }
	}
	
		