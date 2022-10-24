import java.util.Scanner;

public class Arabic {
        public void run(){
            Scanner console = new Scanner(System.in);
            String str = console.nextLine();

            int len = str.length();
            int pluse = str.indexOf("+");
            int minus = str.indexOf("-");
            int multiplication = str.indexOf("*");
            int division = str.indexOf("/");

            if (len < 3 || len > 5) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            if (len >= 3 && len < 5) {
                for (int c = 1; c < 3; c++) {
                    if (pluse == c) {
                        String[] s = str.split("\\+");
                        Byte x1 = Byte.valueOf(s[0]);
                        Byte x2 = Byte.valueOf(s[1]);
                        System.out.print(x1 + x2);
                    }
                    if (minus == c) {
                        String[] s = str.split("-");
                        Byte x1 = Byte.valueOf(s[0]);
                        Byte x2 = Byte.valueOf(s[1]);
                        System.out.print(x1 - x2);
                    }
                    if (multiplication == c) {
                        String[] s = str.split("\\*");
                        Byte x1 = Byte.valueOf(s[0]);
                        Byte x2 = Byte.valueOf(s[1]);
                        System.out.print(x1 * x2);
                    }
                    if (division == c) {
                        String[] s = str.split("/");
                        Byte x1 = Byte.valueOf(s[0]);
                        Byte x2 = Byte.valueOf(s[1]);
                        System.out.print(x1 / x2);
                    }
                }
            }
        }
    }

