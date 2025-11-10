public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); 

        for (int i = 1; i <= N; i++) {   
            int num = i;                 
            int steps = 1;               

            System.out.print(i);

            if (num == 1) {
                System.out.print(" 4 2 1");
                steps = 4;
            } 
			else {
                while (num != 1) {           
                   if (num % 2 == 0) {
                        num = num / 2;       
                    } 
					else {
                        num = 3 * num + 1;   
                    }

                    System.out.print(" " + num);
                    steps++;                 
                }
            }

            System.out.println(" (" + steps + ")"); 
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}