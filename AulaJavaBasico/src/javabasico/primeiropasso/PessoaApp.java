/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.primeiropasso;

/**
 *
 * @author danie
 */
public class PessoaApp {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(1, "Poso");
        Pessoa pessoa2 = new Pessoa(2, "Posa");
        
        System.out.println("O nome da pessoa é" + pessoa1.getName());
    }
}
