package fatec.poo.model;

/**
 *
 * @author 0030482421023
 */

public class FuncionarioComissionado extends Funcionario{
    
    private double salBase, taxaComissao, totalVendas;
    
    public FuncionarioComissionado(int reg, String n, String dta, double tc) {
        super(reg, n, dta);
        taxaComissao = tc;
    }
    
    public void setSalBase(double sb){
        salBase = sb;
    }
    
    public double getSalBase(){
        return(salBase);
    }
    
    public double getTotalVendas() {
        return(totalVendas);
    }
    
    public double getTaxaComissao() {
        return(taxaComissao);
    }
    
    public void addVendas(double v) {
        totalVendas = (totalVendas + v);
    }
    
    public double calcSalBruto() {
      return(salBase + taxaComissao * totalVendas);
    }
    
    public double calcGratif(){
      switch (totalVendas){
          case 
      }
             
    }
    
    public double calcSalLiquido(){ //aplicando polimorfismo e sobreposição (override)
        return(super.calcSalLiquido() + calcGratif());
    }
}
