package beginner.Ex1008;
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double receivedPerHour = sc.nextDouble();

        double salary = workedHours * receivedPerHour;

        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        sc.close(); 
    }
 
}
