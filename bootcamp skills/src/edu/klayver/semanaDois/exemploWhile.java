package edu.klayver.semanaDois;
import java.util.concurrent.ThreadLocalRandom;
public class exemploWhile {
    public static void main(String[] args) {
    double mesada=50.0;
    double gastos=0;
    while (mesada>0) {
        Double valorDoce=valorAleatorio();
        System.out.println("como o valor gasto era menor que sua mesada joao pegou mais doces");
        if(valorDoce>mesada);
            gastos=mesada;
        System.out.println("doce do valor"+valorDoce+"foi adicioonado ao valor da mesada");
    mesada = mesada - gastos;
    if( gastos==30.0 )
    break;
    }
    System.out.println("mesada: "+mesada);
    System.out.println("joao gastou "+gastos);
    }
    private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
