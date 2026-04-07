package fatec.poo.model;

/**
 *
 * @author gabe
 */

//nesta classe, não é possivel instanciar um objeto, serve apenas como referência
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento; // atributo ponteiro
                                       // armazena o endereço de um objeto
                                       // da classe Departamento
                                       // representando a multiplicidade 
    
    public Funcionario (int r, String n, String dta){
        registro = r;
        nome = n;
        dtAdmissao = dta;
    }
    
    // método abstrato
    // apenas a assinatura, a implemetação é feita nas subclasses
    abstract public double calcSalBruto ();
    
    public double calcDesconto(){
        return (0.10 * calcSalBruto());
    }
    
   public double calcSalLiquido(){
       return (calcSalBruto() - calcDesconto());
   }
    
    public void setCargo (String c){
        cargo = c;
    }
    
    public String getCargo(){
        return (cargo);
    }
    
    public int getRegistro (){
        return (registro);
    }
    
    public String getNome (){
        return (nome);
    }
    
    public String getDtAdmissao () {
        return (dtAdmissao);
    }

    // retorna o endereço de um objeto da classe Departamento
    public Departamento getDepartamento() {
        return departamento;
    }

    // tem como parâmetro de entrada o endereço de um objeto da classe Departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}


