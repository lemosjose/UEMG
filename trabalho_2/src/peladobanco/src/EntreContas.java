package peladobanco.src;


import javax.swing.JOptionPane;

public class EntreContas {
    public static void main(String[] args){
        int opcao, opcao2, opcao3, contadep;
        double valor;

        conta Conta1 = new conta();
        conta nova2 = new conta();

        do{
            opcao = JOptionPane.showOptionDialog(null, "Escolha entre criar uma conta ou acessar outra atualmente já disponível", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Criar", "Entrar", "Encerrar"}, null);
            switch(opcao){
                case 0:
                   Conta1.setNome();
                   Conta1.setNumero();
                   Conta1.setTitular();
                   nova2.setNome();
                   nova2.setNumero();
                   nova2.setTitular();
                   break;
                case 1:
                   do{
                    opcao2 = JOptionPane.showOptionDialog(null, "Escolha uma das contas para entrar ", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Conta1", "Conta2", "Sair"}, null);
                    switch(opcao2){
                        case 0:
                           do{
                              opcao3 = JOptionPane.showOptionDialog(null, "Escolha uma ação para a conta", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Depositar", "Sacar", "Verificar Saldo", "Encerrar"}, null);
                              switch(opcao3){
                                case 0:
                                contadep = JOptionPane.showOptionDialog(null, "Escolha a conta para depositar", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sua conta", "Conta2"}, null);
                                   if(contadep == 0){
                                      valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na sua conta"));
                                      Conta1.deposita(valor);
                                   }else if(contadep == 1){
                                      valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na outra conta"));
                                      nova2.deposita(valor);
                                      Conta1.saca(valor);
                                   }
                                   break;
                                case 1:
                                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto você quer retirar da conta atual"));
                                    Conta1.saca(valor);
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "O valor do saldo é "+Conta1.getSaldo());
                                    break;
                               }
                           }while(opcao3 != 3);
                           break;
                        case 1:
                           do{
                               opcao3 = JOptionPane.showOptionDialog(null, "Escolha uma ação para a conta", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Depositar", "Sacar", "Verificar Saldo", "Encerrar"}, null);
                               switch(opcao3){
                                case 0:
                                   contadep = JOptionPane.showOptionDialog(null, "Escolha a conta para depositar", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sua conta", "Conta1"}, null);
                                   if(contadep == 0){
                                      valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na sua conta"));
                                      nova2.deposita(valor);
                                   }else if(contadep == 1){
                                      valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na outra conta"));
                                      Conta1.deposita(valor);
                                      nova2.saca(valor);
                                   }
                                   break;
                                case 1:
                                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto você quer retirar da conta atual"));
                                    nova2.saca(valor);
                                    break;
                                case 2:
                                   JOptionPane.showMessageDialog(null, "O valor do saldo é "+nova2.getSaldo());
                                   break;
                               }
                           }while(opcao3 != 3);
                           break;
                    }
                   }while(opcao2 != 2);
                   break;

            }
        }while(opcao != 2);
    }
}
