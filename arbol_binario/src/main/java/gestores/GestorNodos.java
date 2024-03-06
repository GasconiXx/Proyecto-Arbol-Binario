package gestores;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import modelos.Nodo;

public class GestorNodos {

    private static HashSet<Nodo> nodos = new HashSet<>();

    public static void addNodo(Nodo nodo) {
        
    }

    public static Nodo buscarNodo(String nombreNodo) {
        for (Nodo nodo : nodos) {
            if (nombreNodo == nodo.getNombreNodo()) {
                return nodo;
            }
        }
        return null;
    }
}
