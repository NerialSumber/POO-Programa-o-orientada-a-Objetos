

/**
 *
 * @author 0030482421023
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet; //definição de um ponteiro
        
        objRet = new Retangulo(); //Instanciação (Alocação) do objeto
        
        objRet.setAltura(5.0);// setando os valores para criar a figura
        objRet.setBase(8.0);  // geometrica (retangulo)
        System.out.println("medida da altura do Retângulo: " +
                            objRet.getAltura());
        System.out.println("Medida da base do Retângulo: " +
                            objRet.getBase());
        System.out.println("Medida da area do Retângulo: " + //Exibindo na tela
                            objRet.calcArea());             //resultado da area
        System.out.println("Medida do perimetro do retângulo: " + //Exibindo na tela
                            objRet.calcPerimetro());             //resultado da area
        System.out.println("Medida da Diagonal: " +
                            objRet.calcDiagonal());
        
    }   
}