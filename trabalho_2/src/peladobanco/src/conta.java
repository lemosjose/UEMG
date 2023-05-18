package peladobanco.src;

import javax.swing.JOptionPane;

public class conta{
    private String nome;
    private int numero; 
    private double saldo;
    private String titular;
    public void saca(double valor){
        novoSaldo(getSaldo() - valor);
    }

    public void deposita(double valor){
        novoSaldo(getSaldo() + valor); 
    }

    // getters e setters. gerados automaticamente e podem ser ignorados se 
    // nenhum deles possuir algo especial na chamada
    public String getNome() {
        return this.nome;
    }

    public void setNome() {
        this.nome = JOptionPane.showInputDialog("Digite o seu nome");
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero() {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo() {
        this.saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo da conta "));
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular() {
        this.titular = JOptionPane.showInputDialog("Digite o nome do titular da conta");
    }
    public void novoSaldo(double novo){
        this.saldo = novo;
    }
}
