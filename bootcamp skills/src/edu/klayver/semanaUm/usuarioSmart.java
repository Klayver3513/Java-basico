package edu.klayver.semanaUm;

public class usuarioSmart {
    public static void main(String[] args) {
        
        SmartTv SmartTv = new SmartTv();
        System.out.println("antes de qualuer alteraçao");
        System.out.println("a tv esta ligada? "+ SmartTv.ligada);
        System.out.println("canal atual: "+ SmartTv.canal);
        System.out.println("volume atual: "+SmartTv.volume);

            SmartTv.ligar();
            System.out.println("novo status-> a tv esta ligada? "+ SmartTv.ligada);
            SmartTv.desligar();
            System.out.println("novo status-> a tv esta ligada? "+ SmartTv.ligada);

            SmartTv.ligar();
            SmartTv.mudarCanal(10);
            SmartTv.aumentarCanal();
            SmartTv.aumentarCanal();
            SmartTv.aumentarCanal();
            SmartTv.aumentarCanal();
            SmartTv.aumentarVomlume();
            SmartTv.aumentarVomlume();
            SmartTv.aumentarVomlume();
            System.out.println("apos alteraçao");
            System.out.println("a tv esta ligada? "+ SmartTv.ligada);
            System.out.println("canal atual: "+ SmartTv.canal);
            System.out.println("volume atual: "+SmartTv.volume);
    }
}
