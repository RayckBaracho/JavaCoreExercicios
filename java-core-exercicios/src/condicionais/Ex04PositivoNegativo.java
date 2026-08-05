package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex04PositivoNegativo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0) {

            System.out.println("O número " + numero + " é negativo.");

        } else if (numero == 0) {

            System.out.println("O número é zero.");

        } else {

            System.out.println("O número " + numero + " é positivo.");

        }

        sc.close();
    }
}