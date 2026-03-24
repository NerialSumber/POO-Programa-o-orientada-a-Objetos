
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author 0030482421023
 */
public class Aplic {

    public static void main(String[] args) {
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        
        funcHor.setCargo("Dev");
        funcHor.setQtdeHorTrab(90);
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Data de Admissão: " + funcHor.getDTadmissão());
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Salário Bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Gratificação: " + funcHor.calcGratif());
        System.out.println("Salário Líquido: " + funcHor.calcSalLiquido ());
        
        FuncionarioMensalista funcMensal = new FuncionarioMensalista(2020, "Ana Paula", "15/08/2000", 850);
        
        funcMensal.setCargo("Adm");
        funcMensal.setNumSalMin(2.5);
        System.out.println("Nome: " + funcMensal.getNome());
        System.out.println("Data de Admissão: " + funcMensal.getDTadmissão());
        System.out.println("Registro: " + funcMensal.getRegistro());
        System.out.println("Cargo: " + funcMensal.getCargo());
        System.out.println("Salário Bruto: " + funcMensal.calcSalBruto());
        System.out.println("Desconto: " + funcMensal.calcDesconto());
        System.out.println("Salário Líquido: " + funcMensal.calcSalLiquido());
    
    }
    
}
