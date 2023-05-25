import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    public ArrayList<Livro> emprestados = new ArrayList<Livro>();

    public Usuario(int idade, String nome){
        setIdade(idade);
        setNome(nome);
    }
    public void adicionaLivro(Livro livro){
        emprestados.add(livro);
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Livro> getEmprestados() {
        return this.emprestados;
    }
}
