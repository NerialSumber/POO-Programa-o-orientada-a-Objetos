package fatec.poo.model;

/**
 *
 * @author lana_
 */
public class FuncionarioHorista extends Funcionario{
    
    private double valHoraTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int reg, String n, String dta, double vht){
       super(reg,n,dta);
       valHoraTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    public double calcSalBruto(){ //aplicação do polimorfismo, sobreposição de método
        return(valHoraTrab * qtdeHorTrab);
    }
}
