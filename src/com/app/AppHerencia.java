package com.app;

import com.herencia.*;

import java.util.ArrayList;
import java.util.List;

public class AppHerencia {
    public static void main(String[] args) {
        List<Persona> estudiantes = new ArrayList<>();
        List<Persona> profesores = new ArrayList<>();

        List<Celular> smartphoes = new ArrayList<>();

        List<FigurasGeometricas> circulos = new ArrayList<>();
        List<FigurasGeometricas> cuadrados = new ArrayList<>();
        List<FigurasGeometricas> triangulos = new ArrayList<>();


        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        Smartphone smartphone = new Smartphone();

        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();

        if (estudiante instanceof Persona){
            System.out.println("Es una persona");
        }else {
            System.out.println("No es una persona");
        }
        if (profesor instanceof Persona){
            System.out.println("Es una persona");
        }else {
            System.out.println("No es una persona");
        }

        if (smartphone instanceof Celular){
            System.out.println("Es un celular");
        }else {
            System.out.println("No es un celular");
        }

        if (circulo instanceof FigurasGeometricas){
            System.out.println("Es una figura geometria");
        }else {
            System.out.println("No es una figura geometria");
        }
        if (triangulo instanceof FigurasGeometricas){
            System.out.println("Es una figura geometria");
        }else {
            System.out.println("No es una figura geometria");
        }
        if (cuadrado instanceof FigurasGeometricas){
            System.out.println("Es una figura geometria");
        }else {
            System.out.println("No es una figura geometria");
        }


        estudiantes.add(estudiante);
        mostrarEstudiantes(estudiantes);
    }
    private static void mostrarEstudiantes(List<Persona> personas){
        personas.forEach(todaslaspersonas ->{
            if (todaslaspersonas instanceof Persona){
                System.out.println(todaslaspersonas + " Es una persona");
            }else if (todaslaspersonas instanceof Persona){
                System.out.println(todaslaspersonas + " No es una persona");
            }
        });
    }
}
