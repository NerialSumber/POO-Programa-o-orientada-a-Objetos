
package fatec.poo.model;

/**
 *
 * @author 0030482421023
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdHorTrab;
    
    public FuncionarioHorista(int r, String n, String dta, double vht) {
        super(r, n, dta);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qtd) {
        qtdHorTrab = qtd;
    }
    
    public double calcSalBruto() {
        return (valHorTrab * qtdHorTrab);
    }
    
    public double calcGratificacao() {
        return (calcSalBruto() * 0.075);
    }
    
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
}