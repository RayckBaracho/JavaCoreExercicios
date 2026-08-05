package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex01DuracaoJogo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;

        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        int duracao;

        if (horaFinal > horaInicial) {

            duracao = horaFinal - horaInicial;

        } else {

            duracao = (24 - horaInicial) + horaFinal;

        }

        System.out.println("A duração do jogo foi de " + duracao + " hora(s).");

        sc.close();
    }
}