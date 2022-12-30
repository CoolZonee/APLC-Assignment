/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author coolzone
 */
public class Utils {
    public static double doubleCalculateTotal(List<? extends Number> arr) {
        return arr.stream().mapToDouble(Number :: doubleValue).sum();
    }
    
    public static int intCalculateTotal(List<Integer> arr) {
        return arr.stream().reduce(0, Integer::sum);
    }
    
    public static Function<Double, Function<Double, Double>> minus = x -> y -> x - y;
}
