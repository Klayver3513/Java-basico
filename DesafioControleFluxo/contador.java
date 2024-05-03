package DesafioControleFluxo;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

        System.out.println("digite 2 numeros inteiros a baixo");

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (parametrosInvalidosException exception) {
			System.out.println("o valor do numero 2 deve ser maior que o de numero 1");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws parametrosInvalidosException {
		if(parametroUm>=parametroDois) throw new parametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		for(int i= 1 ; i <= contagem; i++){
            System.out.println("imprimindo a diferença "+i);
        }
	}
    
}
