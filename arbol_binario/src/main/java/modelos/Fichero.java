package modelos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import gestores.GestorNodos;

public class Fichero {


    private static void extraerDatos(File f) throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linea;
            linea = br.readLine();
            while (linea != null) {
                String infoNodo[] = linea.split(" ");
                String nombreNodoPadre = infoNodo[0];
                String nombreNodo = infoNodo[1];
                String costeNodo = infoNodo[2];
                GestorNodos.addNodo(new Nodo(nombreNodoPadre, nombreNodo, costeNodo));
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            throw e;
        }
    }
 }

