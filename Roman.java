import java.util.Scanner;
import java.util.Arrays;

public class Roman {
    public void run() {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        int len = str.length();
        int pluse = str.indexOf("+");
        int minus = str.indexOf("-");
        int multiplication = str.indexOf("*");
        int division = str.indexOf("/");
        String[] rome = new String[101];
        rome[1] = "I";
        rome[2] = "II";
        rome[3] = "III";
        rome[4] = "IV";
        rome[5] = "V";
        rome[6] = "VI";
        rome[7] = "VII";
        rome[8] = "VIII";
        rome[9] = "IX";
        rome[10] = "X";
        rome[11] = "XI";
        rome[12] = "XII";
        rome[13] = "XIII";
        rome[14] = "XIV";
        rome[15] = "XV";
        rome[16] = "XVI";
        rome[17] = "XVII";
        rome[18] = "XVIII";
        rome[19] = "XIX";
        rome[20] = "XX";
        rome[21] = "XXI";
        rome[24] = "XXIV";
        rome[25] = "XXV";
        rome[30] = "XXX";
        rome[36] = "XXXVI";
        rome[40] = "XL";
        rome[49] = "XLIX";
        rome[50] = "L";
        rome[56] = "LVI";
        rome[60] = "LX";
        rome[64] = "LXIV";
        rome[70] = "LXX";
        rome[80] = "LXXX";
        rome[81] = "LXXXI";
        rome[90] = "XC";
        rome[100] = "XXX";

        if (len < 3 || len >= 10) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (len >= 3 && len <= 9) {

            for (int c = 1; c < 5; c++) {
                if (pluse == c) {
                    String[] s = str.split("\\+");
                    String s1 = s[0];
                    String s2 = s[1];
                    int index1 = Arrays.binarySearch(rome, s1);
                    int index2 = Arrays.binarySearch(rome, s2);
                    System.out.print(rome[index1 + index2]);
                }

                if (minus == c) {
                    String[] s = str.split("-");
                    Integer index[] = {Arrays.binarySearch(rome, "s[0]"), Arrays.binarySearch(rome, "s[1]")};
                    System.out.print(rome[index[0] - index[1]]);
                }

                if (multiplication == c) {
                    String[] s = str.split("\\*");
                    Integer index[] = {Arrays.binarySearch(rome, s[0]), Arrays.binarySearch(rome, s[1])};
                    System.out.print(rome[index[0] * index[1]]);
                }

                if (division == c) {
                    String[] s = str.split("/");
                    Integer index[] = {Arrays.binarySearch(rome, s[0]), Arrays.binarySearch(rome, s[1])};
                    System.out.print(rome[index[0] / index[1]]);
                }

            }


        }
    }
}

