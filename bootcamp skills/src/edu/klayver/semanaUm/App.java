package edu.klayver.semanaUm;
public class App {
    public static void main(String[] args){
        String primeiroNome= "klayver" ;
        String segundoNome= "de almeida" ;

        String nome= nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nome);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "seu nome completo é:"+ primeiroNome +" "+ segundoNome;
    }
}
