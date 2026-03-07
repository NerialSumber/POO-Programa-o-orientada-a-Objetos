
import java.util.Scanner;

/**
 *
 * @author 0030482421023
 */
public class Aplic {

    public static void main(String[] args) {         // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double medRaio;
                
        System.out.print("Digite o valor do raio do círculo: ");
        medRaio = entrada.nextDouble();
        
        Circulo objCirc = new Circulo();
        // passagem de mensagens, solicitar a execução de um metodo.
        objCirc.setRaio(medRaio);
        
            System.out.println("\n Valor do Raio: " + objCirc.getRaio() );
            System.out.println("Diametro do Circulo: " + objCirc.calcDiametro());
            System.out.println("Área do Circulo: " + objCirc.calcArea());
            System.out.println("Perimetro do Circulo: "+ objCirc.calcPerimetro());
    }
}
