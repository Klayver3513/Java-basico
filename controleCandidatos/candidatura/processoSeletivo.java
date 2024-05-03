package controleCandidatos.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class processoSeletivo {
    public static void main(String[] args) {
        String [] candidatos={"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"}; 
    for(String candidato:candidatos){
        entrandoEmContato(candidato);
    }
    }
    static void entrandoEmContato (String candidato) {
        int tentativaRealizadas=1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        do {
            atendeu=atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativaRealizadas++;
            }
            else{
                System.out.println("contato realizada com sucesso!!!");
            }
        } while (continuarTentando && tentativaRealizadas<3 );
        if(atendeu){
            System.out.println("conseguimos contatar "+candidato+" na "+tentativaRealizadas+" tentativa realizada");
        }
        else{
            System.out.println("nao conseguimos contato com "+candidato+"!!");
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatos(){
        String [] candidatos={"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"}; 
        System.out.println("Imprimindo a lista de candidatos,imformando o indice");
        for(int indice=0; indice<candidatos.length;indice++){
            System.out.println("o candidato n° "+(indice+1)+" é "+candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos={"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados=0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados<5 && candidatoAtual<candidatos.length) {
            String candidato= candidatos[candidatoAtual];
            double salarioPresendido=valorPretendido();
            System.out.println("o candidato"+ candidato+"solicitou este valor de salario "+salarioPresendido);
            if(salarioBase>=salarioPresendido){
                System.out.println("o candidato "+candidato+"foi selecioando");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPresendido){
        double salarioBase=2000.0;
        if(salarioBase>salarioPresendido){
        System.out.println("ligar para o candidato");
    }
    else if(salarioBase==salarioPresendido){
        System.out.println("ligar com contra propostra");
    }
    else{
        System.out.println("aguardar proximos candidatos");
    }
}
}
