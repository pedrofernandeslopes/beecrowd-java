package beginner.Ex1012;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextFloat();
        double B = sc.nextFloat();
        double C = sc.nextFloat();
        double PI = 3.14159;

        double triangle = (A * C) / 2.0;
        double circle = PI * C * C;
        double trapezium = (A + B) * C / 2.0;
        double square = B * B;
        double rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);

        sc.close();
    }
}
