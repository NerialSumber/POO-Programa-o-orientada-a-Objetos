import java.util.Scanner;

/**
 *
 * @author 0030482421023
 */
public class Aplic {
    public static void main(String[] args) { // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        
        System.out.print("Digite a medida da Altura: ");
        medAlt = entrada.nextDouble(); // mesmo que scanf("%lf", &medAlt)
        System.out.print("Digite a medida da Base: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo();
        // passagem de mensagens, solicitar a execução de um metodo.
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n\n 1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diagonal");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opção: ");
            
            opcao = entrada.nextInt();
        
        if(opcao == 1) {
            System.out.println("Medida da area do Retângulo: " +
                    objRet.calcArea());
        }else
            if(opcao == 2) {
            System.out.println("Medida do perimetro do retângulo: " +
                            objRet.calcPerimetro());
            }else
                if(opcao == 3) {
            System.out.println("Medida da Diagonal: " +
                            objRet.calcDiagonal());
                }
        }while(opcao < 4);
    }
}