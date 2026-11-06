package repeticao;

import java.util.Scanner;

public class Ex02NumerosPares {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();

        for ( int i = 1; i <= N; i ++ )  {
            if ( i % 2 == 0) {
                System.out.println(i);
            }


        }
        sc.close();
    }
}
