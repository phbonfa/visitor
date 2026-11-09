package visitor;

public class Revista implements ItemAcervo {

    private int codigo;
    private String titulo;
    private String edicao;

    public Revista(int codigo, String titulo, String edicao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirRevista(this);
    }
}