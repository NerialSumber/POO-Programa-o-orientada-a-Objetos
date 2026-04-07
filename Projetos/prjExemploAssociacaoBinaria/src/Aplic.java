
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author gab
 */
public class Aplic {
    
    public static void main(String[] args) {

        FuncionarioHorista funcHor = new FuncionarioHorista (1010, "Pedro Silveira", "14/05/1978", 15.80);
        
        FuncionarioMensalista funcMens = new FuncionarioMensalista (2020, "Maria da Silva", "27/11/2010", 1621.00);
        
        FuncionarioComissionado funcComis = new FuncionarioComissionado (3030, "Gisele Maria", "02/09/2001", 6);
        
        Departamento dep1 = new Departamento ("CP", "Compras");
        Departamento dep2 = new Departamento ("RH", "Recursos Humanos");
        
        funcHor.setCargo("Programador");
        funcMens.setCargo("Aux. Administrativo");
        funcComis.setCargo("Vendedor");
        
        // estabelecendo a ligação (apontamento) entre um objeto
        // da classe FunionarioHorista com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O(A) funcionário(a) horista " + funcHor.getNome() + 
                            " trabalha no departamento de " + funcHor.getDepartamento().getNome());
        
        funcMens.setDepartamento(dep1);
        System.out.println("O(A) funcionário(a) mensalista " + funcMens.getNome() + 
                            " trabalha no departamento de " + funcMens.getDepartamento().getNome());
        
        // estabelecendo a ligação (apontamento) entre um objeto
        // da classe FunionarioHorista com um objeto da classe Departamento
        funcComis.setDepartamento(dep2);
        System.out.println("O(A) funcionario Comissionado " + funcComis.getNome() +
                           " Trabalha no Departamento de " + funcComis.getDepartamento().getNome());
        
        // estabelecendo a ligação (apontamento) entre um objeto
        // da classe Departamento com objetos da classes Funcionario horista, mensaliste e comissionado.
        dep1.addFunc(funcHor);
        dep1.addFunc(funcMens);
        dep2.addFunc(funcComis);
        dep1.listFunc();
        dep2.listFunc();
    }
    
}
