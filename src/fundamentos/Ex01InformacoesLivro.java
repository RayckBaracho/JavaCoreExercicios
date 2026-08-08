package fundamentos;

import java.util.Locale;

public class Ex01InformacoesLivro {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        String livro = "Dom Casmurro";
        String autor = "Machado de Assis";

        int anoPublicacao = 1899;
        int paginas = 256;
        char categoria = 'A';

        double precoLivro = 49.90;
        double precoFrete = 12.75;
        double notaMedia = 9.45678912;

        System.out.println("---- Informações do Livro ----");

        System.out.println("Livro: " + livro);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Páginas: " + paginas);
        System.out.println("Categoria: " + categoria);

        System.out.printf("Preço do livro: R$ %.2f%n", precoLivro);
        System.out.printf("Frete: R$ %.2f%n", precoFrete);

        System.out.printf("Nota com 8 casas: %.8f%n", notaMedia);
        System.out.printf("Nota com 3 casas: %.3f%n", notaMedia);

        Locale.setDefault(Locale.US);
        System.out.printf("Formato americano: %.3f%n", notaMedia);
    }
}