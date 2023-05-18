package companhia_aerea.src;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        int opcao, passageiros;

        Voo voo815 = new Voo();

        voo815.setCodigo();
        voo815.setDate();

        do{
            opcao = JOptionPane.showOptionDialog(null, "Você está na central da Oceanic Airlines, alterando informações do Vôo "+voo815.getCodigo()+", Este vôo está programado para o dia "+voo815.getDate()+" Escolha uma opção para alterar o número de passageiros ou verificar a ocupação atual", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Adicionar Passageiros", "Remover Passageiros", "Verificar ocupação", "Encerrar"}, null);
            switch(opcao){
                case 0:
                   passageiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser adicionado"));
                   voo815.adicionaPass(passageiros);
                   break;
                case 1:
                   passageiros = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de passageiros a ser removido"));
                   voo815.removePass(passageiros);
                   break;
                case 2:
                   JOptionPane.showMessageDialog(null, "A ocupação atual é "+voo815.getNumPass());
                   break;
            }
        }while(opcao != 3);
    }
}
