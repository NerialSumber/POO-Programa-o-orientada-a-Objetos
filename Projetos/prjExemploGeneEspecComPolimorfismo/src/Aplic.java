
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author 0030482421023
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        int opcao;
        double valVenda;
        
        FuncionarioHorista objFuncHorTrab = new FuncionarioHorista(1010, "Pedro Gomes", 
                                                                         "14/05/1978", 15.80);
        objFuncHorTrab.setQtdeHorTrab(90);
        objFuncHorTrab.setCargo("Garçom");
        System.out.println("\t\tFUNCIONÁRIO(A) HORISTA");
        System.out.println("Nome: " + objFuncHorTrab.getNome());
        System.out.println("Registro: " + objFuncHorTrab.getRegistro());
        System.out.println("Data de Admissão: " + objFuncHorTrab.getDtAdmissao());
        System.out.println("Cargo: " + objFuncHorTrab.getCargo());
        System.out.println("- Salário Bruto:   => " + df.format(objFuncHorTrab.calcSalBruto()));
        System.out.println("- Desconto         => " + df.format(objFuncHorTrab.calcDesconto()));
        System.out.println("- Salário Líquido: => " + df.format(objFuncHorTrab.calcSalLiquido()));
        System.out.println("- Gratificação:    => " + df.format(objFuncHorTrab.calcGratificacao()));
        
        FuncionarioMensalista objFuncMensTrab = new FuncionarioMensalista(1212, "Ana Paula", 
                                                                                "03/09/1986", 850);
        objFuncMensTrab.setNumSalMin(2.5);
        objFuncMensTrab.setCargo("Cozinheira");
        System.out.println("\n\n\t\tFUNCIONÁRIO(A) MENSALISTA");
        System.out.println("Nome: " + objFuncMensTrab.getNome());
        System.out.println("Registro: " + objFuncMensTrab.getRegistro());
        System.out.println("Data de Admissão: " + objFuncMensTrab.getDtAdmissao());
        System.out.println("Cargo: " + objFuncMensTrab.getCargo());
        System.out.println("- Salário Bruto   => " + df.format(objFuncMensTrab.calcSalBruto()));
        System.out.println("- Desconto        => " + df.format(objFuncMensTrab.calcDesconto()));
        System.out.println("- Salário Líquido => " + df.format(objFuncMensTrab.calcSalLiquido()));
        
        
        FuncionarioComissionado objFunComisTrab = new FuncionarioComissionado(1313, "Beyonce Knowles", 
                                                                                    "11/05/2000", 10);
        
        objFunComisTrab.setCargo("Ajudante");
        objFunComisTrab.setSalBase(900);
        objFunComisTrab.addVendas(1000);
        objFunComisTrab.addVendas(3000);
        objFunComisTrab.addVendas(4000);
        System.out.println("\n\n\t\tFUNCIONÁRIO(A) COMISSIONADO");
        System.out.println("Nome: " + objFunComisTrab.getNome());
        System.out.println("Registro: " + objFunComisTrab.getRegistro());
        System.out.println("Data de Admissão: " + objFunComisTrab.getDtAdmissao());
        System.out.println("Cargo: " + objFunComisTrab.getCargo());
        System.out.println("- Salário Base     => " + df.format(objFunComisTrab.getSalBase()));
        System.out.println("- Salário Bruto    => " + df.format(objFunComisTrab.calcSalBruto()));
        System.out.println("- Desconto         => " + df.format(objFunComisTrab.calcDesconto()));
        System.out.println("- Salário Líquido  => " + df.format(objFunComisTrab.calcSalLiquido()));
        System.out.println("- Gratificação     => " + df.format(objFunComisTrab.calcGratificacao()));
        System.out.println("- Total das Vendas => " + df.format(objFunComisTrab.getTotalVendas()));
        System.out.println("- Comissão         => " + df.format(objFunComisTrab.getTaxaComissao()) + "%");
    }
}
