
import fatec.poo.model.FuncionarioHorista;

/**
 *
 * @author lana_
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        
        funcHor.setQtdeHorTrab(90);
        System.out.println("Salário Bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Salário Líquido: " + funcHor.calcSalLiquido());
        
        FuncionarioMensalista funcMensal = new FuncionarioMensalista()
        
    }
    
}
