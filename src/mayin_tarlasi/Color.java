package mayin_tarlasi;

public interface Color {


    String BLACK = "\033[1;30m";
    String RED = "\033[1;31m";
    String GREEN = "\033[1;32m";
    String YELLOW = "\033[1;33m";
    String BLUE = "\033[1;34m";
    String PURPLE = "\033[1;35m";
    String CYAN = "\033[1;36m";
    String WHITE = "\033[1;37m";

    // Bright Text High Intensity
    String BLACK_B = "\033[1;90m"; // BLACK
    String RED_B = "\033[1;91m";   // RED
    String GREEN_B = "\033[1;92m"; // GREEN
    String YELLOW_B = "\033[1;93m";// YELLOW
    String BLUE_B = "\033[1;94m";  // BLUE
    String PURPLE_B = "\033[1;95m";// PURPLE
    String CYAN_B = "\033[1;96m";  // CYAN
    String WHITE_B = "\033[1;97m"; // WHITE

    String RESET = "\u001B[0m";
}


