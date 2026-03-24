/**
 *
 * @author lana_
 */
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

public class Aplic {

    public static void main(String[] args) {
       Cliente objCli = new Cliente("459.465.894-45","Monica Tavares", "985412345");
       
       objCli.setAltura(1.65);
       objCli.setPeso(70);
       
       System.out.println("Nome: " + objCli.getNome());
       System.out.println("CPF: " + objCli.getCpf());
       System.out.println("Telefone: " + objCli.getTelefone());
       System.out.println("Altura: " + objCli.getAltura());
       System.out.println("Peso: " + objCli.getPeso());
       
       Instrutor objInst = new Instrutor(3535, "Miguel Santos", "965741248");
       
       objInst.setAreaAtuacao("Ingles");
       
        System.out.println("\n\nIdentificação: " + objInst.getIdentificacao());
        System.out.println("Nome: " + objInst.getNome());
        System.out.println("Telefone: " + objInst.getTelefone());
        System.out.println("Área de Atuação: " + objInst.getAreaAtuacao());
    }
    
}
