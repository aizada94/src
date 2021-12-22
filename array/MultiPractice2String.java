package array;

public class MultiPractice2String {
    public static void main(String[] args) {
        // states of different regions in US
        //print out every state one by one

        String[][] states = {{"IL", "OH"}, {"NY", "FL", "NC"}, {"CA", "WA", "OR", "UT"}};
        for (String[] state : states) {
            for (String st : state) {
                System.out.println(st);

            }
        }
        System.out.println("===================");    //second way of printing out every state one by one

        for(int i = 0; i< states.length; i++) {

            for (int k = 0; k < states[i].length; k++) {

                System.out.println(states[i][k]);
            }
        }
        //

    }
}