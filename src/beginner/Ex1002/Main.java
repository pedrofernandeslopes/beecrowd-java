package beginner.Ex1002;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        
        double A = pi * r * r;

        System.out.printf("A=%.4f\n", A);

        sc.close();        
    }
 
}