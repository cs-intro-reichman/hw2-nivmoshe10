// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            double p = 1.0 / (2 * i + 1);    
            if (i % 2 == 0) 
			sum += p;  

            else 
			sum -= p;
        }
        	double pi = 4 * sum;
			System.out.println("pi according to Java: "+Math.PI+"\npi, approximated:     "+pi);
    }
}

