package edu.klayver.semanaDois;

import java.util.Scanner;

public class sistemaMedida {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("sua camisa é P/M/G? ");
    String sigla=sc.next();
    switch (sigla) {
        case "P":
            System.out.println("piquines");
            break;
            case "M":
            System.out.println("mei la mei ca");
            break;
            case "G":
            System.out.println("gigantesca");
            break;
    
        default:
        System.out.println("indefinido");
            break;
    }
}
}
