package loops.forLoop;

public class ReversingString {
    public static void main(String[] args) {
        //reverse given string
        String str = "Lets do it";
        String reverse = "";

        for(int index = str.length()-1; index >= str.length(); index--){

            reverse = reverse+ str.charAt(index);

        }
        System.out.println(str);
        System.out.println(reverse);
    }
}
