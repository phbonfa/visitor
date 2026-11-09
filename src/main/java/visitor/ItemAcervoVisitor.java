package visitor;

public class ItemAcervoVisitor implements Visitor {

    public String exibir(ItemAcervo item) {
        return item.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "codigo=" + livro.getCodigo() +
                ", titulo='" + livro.getTitulo() + '\'' +
                ", genero=" + livro.getNomeGenero() +
                '}';
    }

    @Override
    public String exibirRevista(Revista revista) {
        return "Revista{" +
                "codigo=" + revista.getCodigo() +
                ", titulo='" + revista.getTitulo() + '\'' +
                ", edicao='" + revista.getEdicao() + '\'' +
                '}';
    }

    @Override
    public String exibirArtigo(Artigo artigo) {
        return "Artigo{" +
                "codigo=" + artigo.getCodigo() +
                ", titulo='" + artigo.getTitulo() + '\'' +
                ", doi=" + artigo.getDoi() +
                '}';
    }
}