package javabasico.heranca;

public class ClientePF extends Cliente {
    private String cpf;
    
    public ClientePF(String name, String adress, String cpf){
        super(name, adress);
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
