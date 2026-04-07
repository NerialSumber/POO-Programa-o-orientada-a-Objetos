package fatec.poo.model;

/**
 *
 * @author gabe
 */

public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado (int r, String n, String dta, double tx){
        super(r, n, dta);
        taxaComissao = tx;
    }
    
    public void setSalBase(double sb){
        salBase = sb;
    }
    
    public double getSalBase(){
        return (salBase);
    }
    
    public void setTotalVendas (double tv){
        totalVendas = tv;
    }
    
    public double getTotalVendas(){
        return (totalVendas);
    }
    
    public double getTaxaComissao(){
        return (taxaComissao/100);
    }
    
    public void addVendas(double v){
        totalVendas = getTotalVendas() + v;
    }

    public double calcSalBruto(){
        return (getSalBase() + (getTaxaComissao() * getTotalVendas()));
    }
    
    public double calcGratificacao(){
        if (totalVendas >= 5000){
            return 0;
        } else{
            if (totalVendas >= 10000){
                return (0.03 * calcSalBruto());
            } else {
                return (0.05 * calcSalBruto());
            }            
        }
    }
    
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}