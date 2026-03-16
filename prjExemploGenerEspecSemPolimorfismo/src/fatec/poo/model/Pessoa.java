
package fatec.poo.model;

/**
 *
 * @author 0030482421023
 */
public class Pessoa {
    private String nome;
    private String dataNasc;
    
    public Pessoa(String n, String dn)  {
        nome = n;
        dataNasc = dn;
    }
    
    public String getNome() {
        return(nome);
    }
    
    public String getDataNasc() {
        return(dataNasc);
    }
    
    
}


