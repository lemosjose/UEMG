public class Livro{
    private String titulo; 
    private String autor;
    private int numPag;
    public Livro(String autor, int paginas, String titulo){
        setAutor(autor);
        setTitulo(titulo);
        setNumPag(paginas);
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return this.numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}