package main.java;

public class Validation {
    public static boolean isString(char c) {
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            return true;
        }
        return false;
    }
    
    public static boolean isNumericOrDot(char c) {
        if (Character.isDigit(c) || Character.isISOControl(c) || Character.toString(c).equals(".")){
            return true;
        }
        return false;
    }
    
    public static boolean isNumeric(char c) {
        if (Character.isDigit(c) || Character.isISOControl(c)){
            return true;
        }
        return false;
    }
}
