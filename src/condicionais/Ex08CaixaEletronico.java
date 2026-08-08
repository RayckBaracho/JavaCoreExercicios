package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex08CaixaEletronico {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double saldoDisponivel;
        double valorSaque;

        System.out.print("Digite seu nome: ");
        nome = sc.next();

        System.out.print("Digite seu saldo disponível: ");
        saldoDisponivel = sc.nextDouble();

        System.out.print("Digite o valor do saque: ");
        valorSaque = sc.nextDouble();

        double saldo;

        if (valorSaque <= 0) {

            System.out.println("Valor de saque inválido.");

        } else if (valorSaque > saldoDisponivel) {

            System.out.println("Saldo insuficiente.");

        } else {

            saldo = saldoDisponivel - valorSaque;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Cliente: " + nome);
            System.out.printf("Saldo restante: R$ %.2f%n", saldo);

        }

        sc.close();
    }
}