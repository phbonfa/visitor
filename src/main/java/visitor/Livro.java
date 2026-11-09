package visitor;

public class Livro implements ItemAcervo {

    private int codigo;
    private String titulo;
    private Genero genero;

    public Livro(int codigo, String titulo, Genero genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeGenero() {
        return this.genero.getNome();
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirLivro(this);
    }
}