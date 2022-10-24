import java.util.Scanner;

public class Scan {
    String str;

    Scan() {
        Scanner console = new Scanner(System.in);
        str = console.nextLine();
        char[] result = str.toCharArray();

        if (Character.isLetter(result[0])) {
            Roman roman = new Roman(str);
            roman.run();
        } else {
            Arabic arabic = new Arabic(str);
            arabic.run();
        }
    }
}
