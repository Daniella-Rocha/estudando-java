/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.primeiropasso;

/**
 *
 * @author daniella
 */
public class Pessoa {

    private int code;

    private String name;

    public Pessoa(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
