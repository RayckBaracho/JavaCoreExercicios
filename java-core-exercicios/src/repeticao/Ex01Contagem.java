package repeticao;
import java.util.Scanner;

public class Ex01Contagem {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++ ) {
            System.out.println(i);
        }

        sc.close();

    }
}
