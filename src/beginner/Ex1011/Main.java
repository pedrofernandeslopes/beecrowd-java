package beginner.Ex1011;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        double volume = (4.0/3.0) * 3.14159 * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();   
    }
}
