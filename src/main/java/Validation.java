package main.java;

public class Validation {
    public static boolean isString(char c) {
        return Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c);
    }
    
    public static boolean isNumericOrDot(char c) {
        return Character.isDigit(c) || Character.isISOControl(c) || Character.toString(c).equals(".");
    }
    
    public static boolean isNumeric(char c) {
        return Character.isDigit(c) || Character.isISOControl(c);
    }
}
