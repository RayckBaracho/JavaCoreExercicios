package repeticao;

import java.util.Scanner;

public class Ex04SomaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            soma += i;

        }

        System.out.println(soma);

        sc.close();

    }
}