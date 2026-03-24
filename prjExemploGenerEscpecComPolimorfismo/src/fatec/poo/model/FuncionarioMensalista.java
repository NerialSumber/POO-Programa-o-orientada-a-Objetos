package fatec.poo.model;

/**
 *
 * @author lana_
 */
public class FuncionarioMensalista extends Funcionario{
   private double valSalMin;
   private double numSalMin;
   
   public FuncionarioMensalista(int reg, String n, String dta, double vsm){
       super(reg, n, dta);
       valSalMin = vsm;
   }
   
   public void setNumSalMin(double nsm){
       numSalMin = nsm;
   }
   
   public double calcSalBruto(){
       return(valSalMin * numSalMin);
   }
}
