package companhia_aerea.src;

import javax.swing.JOptionPane;

public class Voo {
    private String codigo;
    private int numPass;
    private String date;

    public void adicionaPass(int newPass){
        if(this.numPass >= 100){
            JOptionPane.showMessageDialog(null, "O vôo já está cheio, adicionar mais pasageiros configurará overbooking");
        }else if(this.numPass + newPass > 100){
            JOptionPane.showMessageDialog(null, "Não é possível adicionar todos os passageiros, adicionando apenas "+(100 - getNumPass()));
            setNumPass(100);
        }else{
            this.numPass += newPass;
        }
    }

    public void removePass(int pass){
        if(getNumPass() - pass < 0){
            JOptionPane.showMessageDialog(null, "Verifique antes de remover, sequer há o número de passageiros sendo removido, configurando para 0 a ocupação do vôo");
            setNumPass(0);
        }else{
            setNumPass(getNumPass() - pass);
        }

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo() {
        this.codigo = JOptionPane.showInputDialog("Digite o codigo do Vôo");
    }

    public int getNumPass() {
        return this.numPass;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate() {
        this.date = JOptionPane.showInputDialog("Digite a data do vôo");
    }
    
}
