package televisao.src;

import javax.swing.JOptionPane;

public class TV {
    private int canal;
    private int volume;
    private boolean ligada;
    public void TV(){
        setLigada(false);
    }
    public void aumentaVol(){
        if(this.ligada == false){
            JOptionPane.showMessageDialog(null, "A TV está desligada, não é possível aumentar o volume");
        }else{
            setVolume(getVolume() + 1);
        }
    
    }
    public void reduzVol(){
        if(this.ligada == false){
            JOptionPane.showMessageDialog(null, "A TV está desligada, não é possível reduzir o volume");
        }else{
            setVolume(getVolume() - 1);
        }
    }

    public void sobeCanal(){
        if(this.ligada == false){
            JOptionPane.showMessageDialog(null, "A TV está desligada, não é possível subir o canal");
        }else{
            setCanal(getCanal() + 1);
        }
    }

    public void desceCanal(){
        if(this.ligada == false){
            JOptionPane.showMessageDialog(null, "A TV está desligada, não é possível descer o canal");
        }else{
            setCanal(getCanal() - 1);
        }
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    public String getLigada() {
        if(this.ligada == false){
            return "Desligada";
        }else{
            return "Ligada";
        }
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
