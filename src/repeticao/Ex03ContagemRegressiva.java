package repeticao;
import java.util.Scanner;


public class Ex03ContagemRegressiva {

    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            for (int i = num; i >= 0; i-- ) {
                System.out.println(i);
            }

            sc.close();

        }
    }


