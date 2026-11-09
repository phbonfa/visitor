package visitor;

public interface Visitor {

    String exibirLivro(Livro livro);
    String exibirRevista(Revista revista);
    String exibirArtigo(Artigo artigo);

}