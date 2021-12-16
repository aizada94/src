package loops.forLoop;

public class PalindromePractice {
    public static void main(String[] args) {
        // civic, ana
        String str = "Efe";
        String reverse = "";

        for(int index = str.length()-1; index >=0; index--){

            reverse+= str.charAt(index);

        }
        if(reverse.equalsIgnoreCase(str)) {
            System.out.println("it is palindrome string");
        }else {


            System.out.println("It is not a palindrome string");
        }
        System.out.println("============");
        // find out if given number is palindrome number or not

        int number = 1234321;
        String str1 = ""+number;


    }
}
