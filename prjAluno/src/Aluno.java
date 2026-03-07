/**
 *
 * @author 0030482421023
 */
public class Aluno {
    private long RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(long ra){
        RA = ra;
    }
    
    public void setNtPrv1(double prova1){
        NtPrv1 = prova1;
    }
    
    public void setNtPrv2(double prova2){
        NtPrv2 = prova2;
    }
    
    public void setNtTrab1(double trab1){
        NtTrab1 = trab1;
    }
    
    public void setNtTrab2(double trab2){
        NtTrab2 = trab2;
    }
    
    public long getRA(){
        return(RA);
    }
    
    public double getNtPrv1(){
        return(NtPrv1);
    }
    
    public double getNtPrv2(){
        return(NtPrv2);
    }
    
    public double getNtTrab1(){
        return(NtTrab1);
    }
    
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75 * (NtPrv1 + 2 * NtPrv2) /3);
    }
    
    public double calcMediaTrab(){
        return(0.25 *(NtTrab1 + NtTrab2) /2);
    }
    
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }
}
