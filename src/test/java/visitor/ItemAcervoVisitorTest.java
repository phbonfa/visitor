package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemAcervoVisitorTest {

    @Test
    void deveExibirLivro() {
        Livro livro = new Livro(1, "O Hobbit", new Genero("Fantasia"));

        ItemAcervoVisitor visitor = new ItemAcervoVisitor();
        assertEquals("Livro{codigo=1, titulo='O Hobbit', genero=Fantasia}", visitor.exibir(livro));
    }

    @Test
    void deveExibirRevista() {
        Revista revista = new Revista(1, "National Geographic", "Edição 250");

        ItemAcervoVisitor visitor = new ItemAcervoVisitor();
        assertEquals("Revista{codigo=1, titulo='National Geographic', edicao='Edição 250'}", visitor.exibir(revista));
    }

    @Test
    void deveExibirArtigo() {
        Artigo artigo = new Artigo(1, "Artigo 01", 10.1005f);

        ItemAcervoVisitor visitor = new ItemAcervoVisitor();
        assertEquals("Artigo{codigo=1, titulo='Artigo 01', doi=10.1005}", visitor.exibir(artigo));
    }
}