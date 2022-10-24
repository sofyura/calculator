import java.util.Arrays;
import java.util.Scanner;

public class Arabic {
    String str;

    Byte x1;
    Byte x2;

    Arabic(String str) {
        this.str = str;
    }

    public void run() {

        int len = str.length();
        int pluse = str.indexOf("+");
        int minus = str.indexOf("-");
        int multiplication = str.indexOf("*");
        int division = str.indexOf("/");


        if (len >= 3 && len < 5) {
            for (int c = 1; c < 3; c++) {
                if (pluse == c) {
                    String[] s = str.split("\\+");

                    x1 = Byte.valueOf(s[0]);
                    x2 = Byte.valueOf(s[1]);
                    if((x1<0 || x1>10)||(x2<0||x2>10)){
                        throw new Error("throws Exception");
                    }
                    else {
                        System.out.print(x1 + x2);
                    }
                }
                if (minus == c) {
                    String[] s = str.split("-");
                    x1 = Byte.valueOf(s[0]);
                    x2 = Byte.valueOf(s[1]);
                    if((x1<0 || x1>10)||(x2<0||x2>10)){
                        throw new Error("throws Exception");
                    }
                    else {
                        System.out.print(x1 - x2);
                    }
                }
                if (multiplication == c) {
                    String[] s = str.split("\\*");
                    x1 = Byte.valueOf(s[0]);
                    x2 = Byte.valueOf(s[1]);
                    if((x1<0 || x1>10)||(x2<0||x2>10)){
                        throw new Error("throws Exception");
                    }
                    else {
                        System.out.print(x1 * x2);
                    }
                }
                if (division == c) {
                    String[] s = str.split("/");
                    x1 = Byte.valueOf(s[0]);
                    x2 = Byte.valueOf(s[1]);
                    if((x1<0 || x1>10)||(x2<0||x2>10)){
                        throw new Error("throws Exception");
                    }
                    else {
                        System.out.print(x1 / x2);
                    }
                }
            }
        } else {
            throw new Error("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

    }
}


