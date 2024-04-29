package edu.klayver.semanaUm;

public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=15;

    public void mudarCanal(int canalNovo){
        canal=canalNovo;
    }
    public void aumentarCanal(){
        canal++;
}
    public void abaixarCanal(){
        canal--;
}
    public void aumentarVomlume(){
    volume++;
}
    public void abaixarVolume(){
    volume--;
}
    public void ligar(){
    ligada=true;
}

    public void desligar(){
    ligada=false;
}

}
