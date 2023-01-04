package utils;

import java.util.Scanner;

public class Utils {

    private static Scanner scan = new Scanner(System.in);

    public static int leerNumero() {
        return scan.nextInt();
    }

    public static char leerCaracter() {
        String s = scan.nextLine();
        if(!s.isEmpty()) {
            return s.charAt(0);
        }
        return 'z';
    }
}
