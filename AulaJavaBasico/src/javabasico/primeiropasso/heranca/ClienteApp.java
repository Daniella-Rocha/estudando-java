/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.primeiropasso.heranca;

/**
 *
 * @author danie
 */
public class ClienteApp {
    public static void main(String[] args){
        ClientePF clientePf = new ClientePF("cliente 1", "rua 1", "1234567800");
        
        ClientePJ clientePj = new ClientePJ("cliente 2", "rua 2", "79.842.882/0001-92");
        
        System.out.println("Nome do cliente: " + clientePf.getName());
        System.out.println("Nome do cliente: " + clientePj.getName());
    }
}
