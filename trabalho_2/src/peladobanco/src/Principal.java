package peladobanco.src;

import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args){
        int opcao;
        double dinheiro;
        conta Conta = new conta();
        Conta.setNome();
        Conta.setNumero();
        Conta.setTitular();
        do{
            opcao = JOptionPane.showOptionDialog(null, "Conta Bancária no peladobanco de "+Conta.getNome()+" do titular "+Conta.getTitular(), null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Depositar", "Sacar", "Verificar saldo", "Encerrar"}, null);
            switch(opcao){
                case 0:
                    dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto quer depositar"));
                    Conta.deposita(dinheiro);
                    break;
                case 1:
                   dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto quer sacar"));
                   Conta.saca(dinheiro);
                   break;
                case 2:
                   JOptionPane.showMessageDialog(null, "Seu saldo é: "+Conta.getSaldo());
                   break;
            }
        }while(opcao != 3);
    }
}