package array;

public class ForEachLoopPractice2 {
    public static void main(String[] args) {
       char[] chs =  {'A', '4', '&', 'z', '3', 'u', '*'};
       //by using for each loop print out letters only

        for(char letter : chs){
            if(letter >='A' && letter<= 'Z'|| letter >='a'&& letter<='z'){
                System.out.println(letter);
            }

        }
        System.out.println("=============================");
  //============================================ Second way of solution

        for(char letters: chs){
            if(Character.isAlphabetic(letters)){
                System.out.println(letters);
            }else if(Character.isDigit(letters)) {
                System.out.println("This is a digit "+ letters);
            }else{
                System.out.println("This is some symbol "+ letters);

            }
        }

    }

}
