package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex05MaiorEntreDois {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O maior número é: " + num2);
        }

        sc.close();
    }
}