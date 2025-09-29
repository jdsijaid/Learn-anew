package day6.util;

import java.util.Scanner;

public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        for (; ; ) {
            String str = scanner.nextLine();
            if (str.length() == 1) {
                c = str.charAt(0);
                if (c >= '1' && c <= '5') {
                    break;
                }
            }
            System.out.print("输入有误，请重新输入(1-5)：");
        }
        return c;
    }

    public static char readChar() {
        String str = scanner.nextLine();
        return str.length() > 0 ? str.charAt(0) : '\0';
    }

    public static String readString() {
        return scanner.nextLine();
    }

    public static int readInt() {
        int n;
        for (; ; ) {
            try {
                String str = scanner.nextLine();
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("输入有误，请重新输入数字：");
            }
        }
        return n;
    }

    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = scanner.nextLine().toUpperCase();
            if (str.length() == 1) {
                c = str.charAt(0);
                if (c == 'Y' || c == 'N') {
                    break;
                }
            }
            System.out.print("输入有误，请重新输入(Y/N)：");
        }
        return c;
    }
}
