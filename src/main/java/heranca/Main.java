package heranca;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Machado de Assis");
        livro.setValor(49);

        if (livro.aplicaDescontoDe(0.3)){
            System.out.println("O valor do livro com desconto foi: " + livro.getValor());
        } else {
            System.out.println("Não foi possível aplicar o desconto.");
        }


        LivroDigital livroDigital = new LivroDigital("Machado de Assis");
        livroDigital.setValor(29);

        if (livroDigital.aplicaDescontoDe(0.15)){
            System.out.println("O valor do livro digital com desconto foi: " + livroDigital.getValor());
        } else {
            System.out.println("Não foi possível aplicar o desconto.");
        }

    }
}
