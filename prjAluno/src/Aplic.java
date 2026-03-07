
import java.util.Scanner;

/**
 *
 * @author 0030482421023
 */
public class Aplic {

    public static void main(String[] args) { // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double prova1, prova2, trabalho1, trabalho2;
        long valRA; 
        int opcao;
        
        System.out.print("Digite seu RA: ");
        valRA = entrada.nextLong(); 
        
        System.out.print("Digite a nota da Primeira Prova: ");
        prova1 = entrada.nextDouble();
        
        System.out.print("Digite a nota da Segunda Prova: ");
        prova2 = entrada.nextDouble();
        
        System.out.print("Digite a nota do Primeiro Trabalho: ");
        trabalho1 = entrada.nextDouble();
        
        System.out.print("Digite a nota do Segundo Trabalho: ");
        trabalho2 = entrada.nextDouble();
        
        Aluno objAlu = new Aluno();
        // passagem de mensagens, solicitar a execução de um metodo.
        objAlu.setRA(valRA);
        objAlu.setNtPrv1(prova1);
        objAlu.setNtPrv2(prova2);
        objAlu.setNtTrab1(trabalho1);
        objAlu.setNtTrab2(trabalho2);
        
        do{
            System.out.println("\n\n 1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibit Média dos Provas/Trabalhos");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opção: ");
            
            opcao = entrada.nextInt();
            
        if(opcao == 1) {
            System.out.println("Aluno: " + objAlu.getRA() +
                    "\t\n\n Notas: " + "\n\n Prova1: " + objAlu.getNtPrv1() +
                                       "\n\n Prova2: " + objAlu.getNtPrv2() +
                                       "\n\n Trabalho1: " + objAlu.getNtTrab1() +
                                       "\n\n Trabalho2: " + objAlu.getNtTrab2());
                            
        }else
            if(opcao == 2) {
            System.out.println("Aluno: " + objAlu.getRA() +
                    "\t\n\n Média: " + "\n\n Provas: " + objAlu.calcMediaProva() +
                                       "\n\n Trabalhos: " + objAlu.calcMediaTrab());
            }else
                if(opcao == 3) {
            System.out.println("Aluno: " + objAlu.getRA() +
                    "\t\n\n Média Final: " + objAlu.calcMediaFinal());
                }
        }while(opcao < 4);
    }
}
