import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {
    public static void main(String[] args) throws Exception {
        int opcao;
        ArrayList<Livro> acervo = new ArrayList<Livro>();
        String output = ""; 
        String nome = JOptionPane.showInputDialog("Digite o nome do usuario");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuario"));
        Usuario user = new Usuario(idade, nome);
        do{
            opcao = JOptionPane.showOptionDialog(null, "Você está operando o sistema da Long Library, escolha uma ação para realizar", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Inserir livro no acervo", "Inserir livro a ser emprestado ao usuario", "Devolver livro", "Conferir Acervo", "Encerrar"}, null);
            switch(opcao){
               case 0:
                  String tit = JOptionPane.showInputDialog("Digite o título do livro");
                  String aut = JOptionPane.showInputDialog("Digite o nome do autor");
                  int numPag = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro"));
                  acervo.add(new Livro(aut, numPag, tit));
                  break;
               case 1:
                  int livroemp = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a ser inserida como emprestado ao usuario"));
                  user.adicionaLivro(acervo.get(livroemp));
                  break;
               case 2:
                   for(int i = 0; i < user.emprestados.size() ; i++){
                      String lib = user.emprestados.get(i).getTitulo().toString();
                      output += lib+"\n";
                    }
                    int choose = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a ser removida (começa em 0 e os livros estão ordenados)"+output));
                    user.emprestados.remove(choose);
                    output = "";
                    break;
               case 3:
                  for(int i = 0; i < acervo.size(); i++){
                    String acervoprint = acervo.get(i).getTitulo().toString();
                    output += acervoprint+"\n";
                  }
                  JOptionPane.showMessageDialog(null, output);
                  output="";
                  break;
            }
        }while(opcao != 4);
    }
}
