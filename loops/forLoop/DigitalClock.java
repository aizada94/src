package loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {
        //print hours and minutes for 12 hours of a day
        //expamle: 0:0     0:1... 0:59  1:0   1:1  1:2.............. 11:59


        for (int h = 0; h < 12; h++) {

            for (int m = 0; m <= 59; m++) {

                for (int s = 0; s <= 59; s++) {


                    System.out.println(h + ":" + m + ":" + s);
                    break;
                }
            }
        }
    }
}