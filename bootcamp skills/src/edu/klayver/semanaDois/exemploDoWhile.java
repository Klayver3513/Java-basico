package edu.klayver.semanaDois;
import java.util.Random;
import java.util.Scanner;
public class exemploDoWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        System.out.println("tictac...");

        do{
        System.out.println("digite o numero");
         numero=sc.nextInt();
        }while(ticTac(numero));
        System.out.println("boom");
    }
    public static boolean ticTac(int numero){
        boolean boom = new Random().nextInt(10)==numero;
        System.out.println("explodiu? "+boom);
        return ! boom;
    }
}

