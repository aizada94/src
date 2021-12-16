package loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
        //print out every single letter form the string by using for loop

        String str = "Today is snowy";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + "  ");
            //print index number of the letter and * together with the letter >> 0*T  1*o  2*d..
            System.out.print(i + "*" + str.charAt(i) + "  ");


        }
        System.out.println("---------------");
        //print only letter 'y' from the string
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == 'y') {
                System.out.println(index + "" + str.charAt(index));

            }
            //count the number of letter 'n' in the given string
            //There are ... 'n' int the string"
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'n') {
                    count++;
                    // System.out.println(count);
                }
                // System.out.println(count);
            }
            System.out.println("There are " + count + " letter n in the string");


        }


    }
}
