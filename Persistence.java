// https://icpcarchive.ecs.baylor.edu/external/73/7398.pdf
import java.util.*;

class Persistence {
    public static void main(String[] args) {
        persistence();
    }

    public static void persistence() {
        Scanner in = new Scanner(System.in);
        int num, count, result, original;
        String temp;

        while (in.hasNext()) {
            num = in.nextInt();
            original = num;
            count = 0;
            int[] digits;

            // Base case
            if (num < 10) {
                System.out.println(num + " " + 0);
            }

            else {
                while (num >= 10) {
                    // Convert integer to array of digits
                    temp = Integer.toString(num);
                    digits = new int[temp.length()];
                    for (int i =0; i<temp.length(); i++) {
                        digits[i] = temp.charAt(i) - '0';
                    }
                    
                    // Product of digits for each step up to persistence
                    result = 1;
                    for (int i=0; i<digits.length; i++) {
                        result*=digits[i];
                    }
                    num = result;
                    count++;
                }
                System.out.println(original + " " + count);
            }

        }
    }
}