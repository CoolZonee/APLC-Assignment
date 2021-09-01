/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author jieke
 */
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
