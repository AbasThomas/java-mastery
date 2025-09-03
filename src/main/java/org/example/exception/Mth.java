package org.example.exception;

public class Mth {

    public static void main(String[] args) {
        try{
            int result = 24/0;
            System.out.println("ans = " + result);
        }
        catch (ArithmeticException ae){
            System.out.println("Div by zero isn't acceptable " + ae.getMessage());
        }
    }
}
