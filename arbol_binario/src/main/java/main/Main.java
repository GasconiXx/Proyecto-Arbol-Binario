package main;

import java.io.File;
import java.io.IOException;

import gestores.GestorNodos;
import modelos.Fichero;

public class Main {
    public static void main(String[] args) {
        try {
            Fichero.extraerDatos(new File("Fichero.txt"));
            GestorNodos.reasignarSupernodos();
            GestorNodos.asignarSubnodos();
            System.out.println("El camino más barato es desde la hoja: " + GestorNodos.buscarCaminoBarato(GestorNodos.hacerCaminos()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}