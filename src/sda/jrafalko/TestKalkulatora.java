package sda.jrafalko;

import static calculus.Calculator.*;
//import static calculus.Calculator.kmh2ms;

public class TestKalkulatora {
    public static void main(String[] args) {

//        Calculator calc = new Calculator();
        double a = 3.5;
        double b = 6.8;

        double w = add(a, b);
        System.out.println(a + " + " + b + " = " + w);

        //System.out.println("100 km/h = " + kmh2ms(100) + " m/s");
        System.out.printf("100 km/h = %.2f m/s", kmh2ms(100));
    }
}
