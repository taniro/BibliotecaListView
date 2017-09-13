package tads.eaj.com.bibliotecalistview;


public class Livro {

    private String titulo;
    private String autor;
    private int quantidade;
    private Boolean lido;

    public Livro(String titulo, String autor, int quantidade, Boolean lido) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.lido = lido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Boolean getLido() {
        return lido;
    }
}
