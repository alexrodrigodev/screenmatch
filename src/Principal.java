public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Soma de Avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de Avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
    }
}
