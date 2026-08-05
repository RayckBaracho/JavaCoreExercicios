package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex07Login {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.print("Digite o usuário: ");
        usuario = sc.next();

        System.out.print("Digite a senha: ");
        senha = sc.next();

        if (usuario.equals("admin") && senha.equals("1234")) {

            System.out.println("Login efetuado com sucesso!");

        } else {

            System.out.println("Usuário ou senha inválidos.");

        }

        sc.close();
    }
}