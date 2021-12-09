package primitives;

public class TrueTable1 {
    public static void main(String[] args) {
        // visa and ticket

        boolean visa= true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel=  visa == myVisa && ticket == myTicket;
        System.out.println(canTravel);   // No, you cannot travel    /// we can also use & and the result will be False

        // Ask question
        boolean online = true;
        boolean inCampus = true;  // if we change inCapmus = false the result still would we true
        boolean student = true;
        boolean askQuestion= student == online || student == inCampus;
        System.out.println("Can I ask question? "+askQuestion);

        // 90% and more attendance and score of 80 or more to pass this class

        int reqAttendance = 90;
        int reqScore = 80;
        int yourAttendance = 100 ;
        int yourScore = 90;
        boolean passThisClass =yourAttendance >= reqAttendance && yourScore >= reqScore;
        System.out.println("Can I pass this course?" +passThisClass);


        //














    }
}
