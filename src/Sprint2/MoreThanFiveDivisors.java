package Sprint2;

public class MoreThanFiveDivisors {
    public static void main(String[] args) {


        for (int i = 1; i <= 50; i++) {
            int count = 0;
            for (int j = 1; j <= 50; j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            if (count > 5) {
                System.out.println(i);
            }

        }


    }
}
