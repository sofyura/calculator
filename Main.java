import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String str;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        System.out.println(calc(input));
    }

        public static String calc(String input){
            String resultAll;
            str = input;
            char[] result = str.toCharArray();
            if (Character.isLetter(result[0])) {
                Roman roman = new Roman(str);
                resultAll=roman.run();
            } else {
                Arabic arabic = new Arabic(str);
                int arabicSum = arabic.run();
                resultAll = "" + arabicSum;
            }
            return resultAll;
        }
    }
