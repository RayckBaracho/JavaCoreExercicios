package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Ex02ControleDeVendas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do livro: ");
        String nome = sc.nextLine();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.println("Livro: " + nome );


        double original = preco * quantidade;
        System.out.printf("Valor original: R$ %.2f%n" , original);

        double desconto = original / 10;

        double total;

        if (original > 100) {
            total = original - desconto;
            System.out.printf("Desconto: R$ %.2f%n", desconto);
        } else  {
            total = original;
        }
        System.out.printf("Valor final: R$ %.2f%n", total);
    }
}

