// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		System.out.print(N);
		for(int i = 0; N != 1; i++) {
			if (N % 2 == 0) { 
				N = N / 2;
				System.out.print(" " + N);
			}
			else {
				N = (N * 3) + 1;
				System.out.print(" " + N);
			}
		}
     
	}
}  
