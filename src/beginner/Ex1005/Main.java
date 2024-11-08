package beginner.Ex1005;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double MEDIA = (3.5 * A + 7.5 * B) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        sc.close(); 
    }
 
}