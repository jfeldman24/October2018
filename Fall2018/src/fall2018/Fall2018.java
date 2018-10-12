/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2018;

/**
 *
 * @author thomasburrell
 */
public class Fall2018 {

    public static double add(double a, double b) {
        return a+b;
    }
    
    public static double sub(double a, double b) {
        return a-b;
    }
    
    public static int mod(int a, int b) {
        return a%b;
    }
    
    static class fraction {
        private int num, den;
        public fraction(int a, int b) {
            num = a;
            den = b;
        }
        public String toString() {
            return num + "/" + den;
        }
    }
    
    public static void main(String[] args) {
        double a = add(1,2);
        double b = sub(4,1);
        int c = mod(18,4);
        fraction d = new fraction(4,17);
        System.out.println(a + " " + b + " " + c + " " + d);
    }
    
    public static double mult(double a, double b) {
        return a*b;
    }
    
}
