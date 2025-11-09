
public class Cheers {
        public static void main(String[] args) {
        String name = args[0].toUpperCase();
        int num = Integer.parseInt(args[1]);
        int L = name.length();
        String an = "AEFHILMNORSX";

        for (int i = 0; i < L; i++) {
        char ch = name.charAt(i); 

        if (an.indexOf(ch) != -1) { 
        
                System.out.println("Give me an " + ch + ": " + ch + "!");
        } 
        
        else { 
       
                System.out.println("Give me a  " + ch + ": " + ch + "!");
                }
        }
                System.out.println("What does that spell?");

                
        for (int i = 0; i < num; i++) {
                System.out.println(name + "!!!");


                }
        }
}