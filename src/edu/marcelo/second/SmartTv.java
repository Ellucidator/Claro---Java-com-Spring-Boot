package edu.marcelo.second;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume =1;

    public void onOff(){
        this.ligada= !this.ligada;
    }

    public void mudarCanal(int canal){
        this.canal = canal;
    }

    public void aumentarVolume(){
        this.volume++;
    }
    public void diminuirVolume(){
        this.volume--;
    }
}
