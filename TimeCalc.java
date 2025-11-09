public class TimeCalc {
    public static void main(String[] args) {
	String time = args[0];
	
    String[] parts = time.split(":");
	int hh = Integer.parseInt(parts[0]);
	int mm= Integer.parseInt(parts[1]);

    int time2 = Integer.parseInt(args[1]);


	int allminutes = (((hh * 60) + mm) + time2);

	int clock1 = (allminutes / 60);
    int clock11 = (clock1 % 24);

    int clock2 = (allminutes % 60);

    System.out.println(clock11 + ":" + clock2);


    }
}
