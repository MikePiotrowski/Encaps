package util;

public class ConsoleColorPrinter {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[1;91m";
    public static final String ANSI_BLUE = "\u001B[34m";
    // Add more colors as needed

    public static void printInColor(String colorCode, String message) {
        System.out.println(colorCode + message + ANSI_RESET);
    }
}