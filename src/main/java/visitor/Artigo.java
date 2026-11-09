package visitor;

public class Artigo implements ItemAcervo {

    private int codigo;
    private String titulo;
    private float doi; // Ou outro atributo como fatorImpacto / preco

    public Artigo(int codigo, String titulo, float doi) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.doi = doi;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getDoi() {
        return doi;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirArtigo(this);
    }
}