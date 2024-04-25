package edu.klayver.semanaUm;

public class TiposVariaveis {
    public static void main(String[] args) {
        
    
    double salarioMinimo=2250;
    int cep= 45737555; //se começar com 0 telvez tenha cque ser outro tipo(String)
    long cpf=12332443225L; //se começar com 0 telvez tenha cque ser outro tipo(String)
 
    short num1= 1;
    int numNormal= num1;
    short num2=(short) numNormal; //nescessario add cash

    int numero= 1;
    numero=12;
    System.out.println(numero);

    final double VALOR_DE_PI=3.14; 
    //palavra reservada para constante(final)nao pode ser alterado
    System.out.println(VALOR_DE_PI);

    }
}
