/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author nan
 */
public class Method {
    
    // Function for basic calculation
    public static double calc(double x, String input, char opt) {
        double y = Double.parseDouble(input);
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        } else{
            return y;
        }
    }
    
    // Function for calculating factorial
    public static double fact(double x){
        if (x<0)
            return 0;
        else if (x == 0)
            return 1;
        else {
            double out = 1;
            while(x != 1){
                out *= x;
                x--;
            }
            return out;
        }
    }
}
