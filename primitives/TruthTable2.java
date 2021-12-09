package primitives;

public class TruthTable2 {
    public static void main(String[] args) {


        // there is an event for kids
        // if the age of child is 6 or less OR if the height of child is 48 inches or less
        // the event is free for that child

        int reqAge = 6;
        int kidAge = 7;
        double reqHeight = 48;
        double kidHeight = 47;

        boolean isFree = kidAge <=  reqAge || kidHeight <= reqHeight; // reqAge >= kidAge || reqHeight >= kidHeight;
        System.out.println("Is the event free? "+ isFree);

        // find out if student can pass a class
        // there are three test taken
        // average of those test has to be more than 70 or more
        // attendance rate of the student has to be 80% or more
        // print out if student can pass or not
         int test1 = 90;
         int test2 = 60;
         int test3 = 100;
         int reqAvTest = 70;
        int studentAttendance = 81;
        int reqAttendance = 80;
        int averageTest = (test1 + test2 + test3)/3;
        System.out.println(averageTest);

        boolean canPass = averageTest >= reqAvTest && studentAttendance >= reqAttendance;
        System.out.println("Can student pass? "+ canPass);
















    }
}
