package javabasico.sobrecarga;

public class ContaCorrente {
    private int accNumber;
    private int agency;
    private float limit;
    
    public ContaCorrente(int accNumber, int agency){
        this.accNumber = accNumber;
        this.agency = agency;
    }
    
    public ContaCorrente(int accNumber, int agency, float limit){
        this.accNumber = accNumber;
        this.agency = agency;
        this.limit = limit;
    }
    
    public int getAccNumber(){
        return accNumber;
    }
    
    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }
    
    public int getAgency(){
        return agency;
    }
    
    public void setAgency(int agency){
        this.agency = agency;
    }
    
    public float limit(){
        return limit;
    }
    public void setLimit(float limit){
        this.limit = limit;
    }
}
