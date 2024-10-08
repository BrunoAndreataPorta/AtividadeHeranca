package model;

public class Livro {
    private String titulo;
    private String autor;
    private int idLivro;
    private boolean disponivel;

    public Livro(String titulo, String autor, int idLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Id Livro: " + idLivro +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nDisponibilidade: " + disponivel + "\n";
    }
}
