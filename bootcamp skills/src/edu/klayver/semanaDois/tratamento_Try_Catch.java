package edu.klayver.semanaDois;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tratamento_Try_Catch {
    public static void main(String[] args) {
        try{
        Scanner sc= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome!");
    String nome=sc.next();

        System.out.println("Digite sua idade");
    String idade=sc.next();

        System.out.println("informe sua altura");
    double altura=sc.nextDouble();

        System.out.println("nome: "+ nome +"idade: "+idade+"altura: "+altura);
        }
        catch(InputMismatchException e){
            System.err.println("os campos idade e altura devem ser numericos");
        }
    }
}
