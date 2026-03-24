package fatec.poo.model;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
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

   public int getRegistro(){
   return(registro);
   }

   public String getDTadmissão(){
       return(dtAdmissao);
   }
   
   public String getNome(){
       return(nome);
   }
   
   public String getCargo(){
       return(cargo);
   }
   
   public void setCargo(String c) {
       cargo = c;
   }
   
   
}
