package ch04.q07;

public enum Colours {
    BLACK,
    RED,
    BLUE,
    GREEN,
    CYAN,
    MAGENTA,
    YELLOW,
    WHITE;

    public static Enum<Colours> getRed() {
        return RED;
    }

    public static Enum<Colours> getGreen() {
        return GREEN;
    }

    public static Enum<Colours> getBlue() {
        return BLUE;
    }
}
