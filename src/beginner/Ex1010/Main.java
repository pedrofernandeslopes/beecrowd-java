package beginner.Ex1010;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double amountToPay = 0;        

        for (int i = 0; i < 2; i++) {
            // int productCode = sc.nextInt(); 
            int units = sc.nextInt();      
            double priceUnit = sc.nextDouble();  

            amountToPay += units * priceUnit;
        }    

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", amountToPay);

        sc.close();
    }
}

