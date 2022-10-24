import java.util.Scanner;
import java.util.Arrays;

public class Roman {
    String str;
    Roman(String str) {
        this.str = str;
    }

        int one, two, sum;
        String one1, two1, s1, s2;
        public void run () {

            int len = str.length();
            int pluse = str.indexOf("+");
            int minus = str.indexOf("-");
            int multiplication = str.indexOf("*");
            int division = str.indexOf("/");
            String[] s = new String[2];
            s1 = s[0];
            s2 = s[1];

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



            if (len >= 3 && len <= 9) {

                for (int c = 1; c < 5; c++) {
                    if (pluse == c) {
                        s = str.split("\\+", 2);
                        s1 = s[0];
                        s2 = s[1];
                        for (int a = 1; a < rome.length; a++) {
                            one1 = "" + rome[a];
                            if (one1.equals(s1)) {
                                one = a;
                            }
                        }
                        for (int b = 1; b < rome.length; b++) {
                            two1 = "" + rome[b];
                            if (two1.equals(s2)) {
                                two = b;
                            }
                        }
                        sum = one + two;
                        System.out.println(rome[sum]);
                    }

                    if (minus == c) {
                        s = str.split("-");
                        s1 = s[0];
                        s2 = s[1];
                        for (int a = 1; a < rome.length; a++) {
                            one1 = "" + rome[a];
                            if (one1.equals(s1)) {
                                one = a;
                            }
                        }
                        for (int b = 1; b < rome.length; b++) {
                            two1 = "" + rome[b];
                            if (two1.equals(s2)) {
                                two = b;
                            }
                        }
                        sum = one - two;
                        System.out.println(rome[sum]);
                    }

                    if (multiplication == c) {
                        s = str.split("\\*");
                        s1 = s[0];
                        s2 = s[1];

                        for (int a = 1; a < rome.length; a++) {
                            one1 = "" + rome[a];
                            if (one1.equals(s1)) {
                                one = a;
                            }
                        }
                        for (int b = 1; b < rome.length; b++) {
                            two1 = "" + rome[b];
                            if (two1.equals(s2)) {
                                two = b;
                            }
                        }
                        sum = one * two;
                        System.out.println(rome[sum]);
                    }

                    if (division == c) {
                        s = str.split("/");
                        s1 = s[0];
                        s2 = s[1];

                        for (int a = 1; a < rome.length; a++) {
                            one1 = "" + rome[a];
                            if (one1.equals(s1)) {
                                one = a;
                            }
                        }
                        for (int b = 1; b < rome.length; b++) {
                            two1 = "" + rome[b];
                            if (two1.equals(s2)) {
                                two = b;
                            }
                        }
                        sum = one / two;
                        System.out.println(rome[sum]);
                    }

                }


            }
            else {
                throw new Error("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }


    }
}

