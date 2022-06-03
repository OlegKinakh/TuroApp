package sprint3;

public class Split {
    public static void main(String[] args) {

        String s1 = "What is The Best Program SDET you know Eve";

        /*
        "The Best Program SDET  you!"
         */

        String[] words = s1.split(" ");
        System.out.println(words[2] + " " + words[3] + " " + words[4] + " " + words[5] + "  " + words[6] + "!");
    }
}
