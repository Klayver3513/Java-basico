package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
     public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome!");
    String nome=sc.next();

        System.out.println("Digite seu numero de agencia!");
    String agencia=sc.next();

        System.out.println("informe seu numero de conta!");
    int numeroConta=sc.nextInt();

        System.out.println("informe seu saldo");
    double saldo=sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco,"+
        "sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo " +saldo + " já está disponível para saque");
    }
}
