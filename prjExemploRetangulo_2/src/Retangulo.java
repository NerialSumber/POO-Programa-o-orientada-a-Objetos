

/**
 *
 * @author 0030482421023
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){ // seta a variavel altura
        altura= a;
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public void setBase(double b){ // seta a variavel base
        base= b;
    }
    public double getBase(){
        return(base);
    }
    
    public double calcArea(){ // calcula a area
        return(altura * base);
    }
    
    public double calcPerimetro(){ //calcula o perimetro
        return(altura * 2) + (base * 2);
    }
    
    public double calcDiagonal(){                                   // teorema 
        return(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2))); // de pitagoras
    }
} //fim da classe
