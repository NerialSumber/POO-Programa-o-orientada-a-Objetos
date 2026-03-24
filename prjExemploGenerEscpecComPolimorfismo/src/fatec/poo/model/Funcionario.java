package fatec.poo.model;

/**
 *
 * @author lana_
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    
    public Funcionario(int r, String n, String dta){
        registro = r;
        nome = n;
        dtAdmissao = dta;
    }
    
    abstract public double calcSalBruto(); //método abstrato, apresenta apenas a assinatura
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
   public double calcSalLiquido(){
       return(calcSalBruto() - calcDesconto());
   }
}
