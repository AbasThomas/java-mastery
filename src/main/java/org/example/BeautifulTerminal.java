package org.example;

public class BeautifulTerminal {
    // ANSI escape codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) throws InterruptedException {
        System.out.println(CYAN + "---------------------------------" + RESET);
        System.out.println(GREEN + "   ✨ Welcome to My Java App ✨   " + RESET);
        System.out.println(CYAN + "---------------------------------" + RESET);

        // Animated loading dots
        System.out.print(YELLOW + "Loading" + RESET);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            System.out.print(YELLOW + "." + RESET);
        }
        System.out.println("\n" + BLUE + "✅ Done!" + RESET);
    }
}

