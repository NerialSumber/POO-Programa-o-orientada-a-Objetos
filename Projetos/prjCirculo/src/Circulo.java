/**
 *
 * @author 0030482421023
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double r){ // seta a variavel raio
        raio= r;
    }
    
    public double getRaio(){ // retorna valor do raio
        return(raio);
    }
    
    public double calcArea(){ // devolve a area
        return (Math.PI * (raio * raio));
    }
    
    public double calcPerimetro(){ // devolve o perimetro
        return (2 * Math.PI * raio);
    }
    
    public double calcDiametro (){ // devolve o diametro
        return(2 * raio);
    }
} //fim
