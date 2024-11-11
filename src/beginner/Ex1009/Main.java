package beginner.Ex1009;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //String seller = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double Totalsales = sc.nextDouble();

        double salary = fixedSalary + Totalsales * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salary);
        
        sc.close();
    }
 
}
