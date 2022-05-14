package Sprint2;

import java.util.Scanner;

public class WordCountByEugene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a sentence.");


        String str1 = sc.nextLine();

        int wordCount = 1;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                wordCount++;
            }
        }

        System.out.println("Word count is: " + wordCount);

    }
}