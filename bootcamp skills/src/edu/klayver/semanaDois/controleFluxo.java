package edu.klayver.semanaDois;

public class controleFluxo {
public static void main(String[] args) {
 double saldo=17.0;
 double retirar=11;
 if(saldo>retirar){
 saldo = saldo-retirar;
}else{ 
 System.out.println("valor excedeu o seu saldo, seu saldo é: "+ saldo);
}
 System.out.println(saldo);
    }
}
