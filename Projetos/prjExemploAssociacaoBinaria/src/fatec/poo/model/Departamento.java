package fatec.poo.model;

/**
 *
 * @author gabe
 */
public class Departamento {
    private String sigla;
    private String nome;
    private int numFunc; // indice da matriz de objetos
    private Funcionario[] funcionarios; // define uma matriz de objeto
                                        // que representa uma matriz de ponteiros
                                        // indicand multiplicidade 1...*

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFunc(Funcionario f) { // tem parametro de entrada o endereço de um objeto da classes Funcionario
     funcionarios[numFunc] = f;          // Horista, Mensalista e Comissionado
     numFunc++;  
    }
    
    public void listFunc() {
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionarios: " + numFunc);
        System.out.println("\nregistro\t\tNome\t\tCargo");
        for(int x = 0; x < numFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.print(funcionarios[x].getCargo());
        }
    } 
}
