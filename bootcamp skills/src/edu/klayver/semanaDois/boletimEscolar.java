package edu.klayver.semanaDois;

public class boletimEscolar {
    public static void main(String[] args) {
     int nota=7;
    if(nota>7)
        System.out.println("aprovado");
    else if(nota>=5 && nota <7)
        System.out.println("recuperação");
    else 
        System.out.println("reprovado");
    }
}
