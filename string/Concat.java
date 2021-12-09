package string;

public class Concat {
    public static void main(String[] args) {

        String number = "1";
        number+="2";
        number+=2;
        System.out.println(number);  // 122 is the outcome

        // String has built method/functions you can call by using your variable

        String test = "Chicago";

        test = test.concat(" is the best"); // Chicago is the best
        test = test.concat(" in the summer"); // Chicago is the best in the summer
        System.out.println(test);

        test += test.concat(" EVER");
        System.out.println(test);
        


        int num = 5;

    }
}
