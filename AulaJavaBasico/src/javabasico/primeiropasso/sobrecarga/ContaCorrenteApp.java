package javabasico.primeiropasso.sobrecarga;

public class ContaCorrenteApp {
    public static void main(String[] args){
        ContaCorrente contaComum = new ContaCorrente(112131, 1234-5);
        ContaCorrente contaPlatinum = new ContaCorrente(122232, 4567-8, 5000.00f);
    }
}
