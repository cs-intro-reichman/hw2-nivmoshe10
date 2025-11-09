// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.print(N);                 

        while (N != 1) {    

            if (N % 2 == 0) 
			N = N / 2;

        	else  
			N = 3 * N + 1;

            System.out.print(" " + N);      
        }
    }
}