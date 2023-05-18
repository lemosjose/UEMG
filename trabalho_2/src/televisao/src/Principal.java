package televisao.src;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        int opcao, volume, canal;
        TV tubo = new TV();
        do{
            opcao = JOptionPane.showOptionDialog(null, "Você está na interface a Philips, assistindo o canal "+tubo.getCanal()+" no volume "+tubo.getVolume()+" sua TV está "+tubo.getLigada()+" escolha algo para fazer", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Aumentar Volume", "Diminuir volume", "Subir canal", "Descer canal", "Ligar a TV", "Desligar a TV", "Encerrar"}, null);
            switch(opcao){
                case 0:
                   tubo.aumentaVol();
                   break;
                case 1:
                   tubo.reduzVol();
                   break;
                case 2:
                   tubo.sobeCanal();
                   break;
                case 3:
                   tubo.desceCanal();
                   break;
                case 4:
                   tubo.setLigada(true);
                   break;
                case 5:
                   tubo.setLigada(false);
                   tubo.setCanal(0);
                   tubo.setVolume(0);
                   break;
            }
        }while(opcao != 6);
    }
}
