package array;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        String str = "Hummingbirds are birds native to the Americas and comprise the biological family Trochilidae. " +
                "With about 360 species, they occur from Alaska to Tierra del Fuego, but the vast majority of the species are " +
                "found in the tropics. They are small birds, with most species measuring 7.5–13 cm (3–5 in) in length. " +
                "The smallest extant hummingbird species is the 5 cm (2.0 in) bee hummingbird, which weighs less than" +
                " 2.0 g (0.07 oz). The largest hummingbird species is the 23 cm (9.1 in) giant hummingbird, weighing 18–24 grams " +
                "(0.63–0.85 oz). They are specialized for feeding on flower nectar, but all species consume flying insects or spiders.";

        String text = "";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ') {
                text += str.charAt(i);

            }
        }
        System.out.println(text);

        System.out.println("============================");

        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        // find the words that has even amount of letters
        int count = 0;
        for(String word : words){
            if(word.length()%2==0){
                count++;
                System.out.println(word);
            }

        }
        System.out.println(count);
    }

}
