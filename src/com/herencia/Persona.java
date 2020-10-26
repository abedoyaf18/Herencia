package com.herencia;

import java.util.Date;

public class Persona {
    private byte edad;
    private char genero;
    private String idioma;
    private Date fechaNacimiento;
    private String profesion;
    private String nombre;

    public void enseñar(){
        System.out.println("Enseñar");
    }
    public void aprender(){
        System.out.println("aprender");
    }
    public void evaluar(){
        System.out.println("evaluar");
    }
    public void ganar(){
        System.out.println("ganar");
    }
    public void perder(){
        System.out.println("perder");
    }
}
