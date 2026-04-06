
package fatec.poo.model;

/**
 *
 * @author 0030482421023
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin, numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dta, double vsm) {
        super(r, n, dta);
        valSalMin = vsm;
    }
    
    public void setNumSalMin(double nsm) {
        numSalMin = nsm;
    }
    
    public double calcSalBruto() {
        return (valSalMin * numSalMin);
    }
}