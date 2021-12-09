package string;

public class Methods1 {

    public static void main(String[] args) {
        String device = "microphone";

        device = device.concat(" is an input device");

        System.out.println(device);  //

        char ch = device.charAt(1);
        System.out.println(ch);
      // length ();
        int letterCount = device.length();  // returns a number
        System.out.println(letterCount);
         device +=" is expensice";

        device =  device.concat(" device");
        System.out.println(device.length()); //


        // take last char from this last version of the string

        System.out.println(device.charAt(29));  //e
        String example = "The meanings of the designs on totem poles are as varied " +
                "as the Indigenous cultured that makes them. They may celebrate " +
                "cultural beliefs, recount legends, depict family lineage, or" +
                "simply be artistic. There are even used for public ridicule.$";

       char lastChar= example.charAt(example.length()-1);
        System.out.println(lastChar);
//_______________________________
        String example2 = "Thanksgiving is over. The price of the turkey will go down" +
                ".So you can find more inexpensive purchases";
        int count = example2.length();

        char lastLetter = example2.charAt(count-1);
        System.out.println(lastLetter);
  //---------------------

        //find the middle char from last string
        String school = "Techtorial";
        System.out.println(school.charAt((school.length()-1)/2));
        System.out.println(example2.charAt((example2.length()-1)/2));
        System.out.println(example.charAt((example.length()-1)/2));

        System.out.println(school.charAt(15)); //StringIndexOutOfBoundsException





    }
}
