package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex06MaiorEntreTres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("O maior número é: " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("O maior número é: " + num2);

        } else if (num3 > num1 && num3 > num2) {

            System.out.println("O maior número é: " + num3);

        } else {

            System.out.println("Existem números iguais.");

        }

        sc.close();
    }
}