package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex02MediaAluno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double nota1;
        double nota2;

        System.out.print("Nome: ");
        nome = sc.next();

        System.out.print("Primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f%n", media);

        if (media >= 6) {

            System.out.println(nome + " está aprovado.");

        } else {

            System.out.println(nome + " está reprovado.");

        }

        sc.close();
    }
}