package gestores;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


import modelos.Nodo;

public class GestorNodos {

    private static HashSet<Nodo> nodos = new HashSet<>();

    public static boolean addNodo(Nodo nodo) {
        return nodos.add(nodo);
    }

    public static Nodo buscarNodo(String nombreNodo) {
        for (Nodo nodo : nodos) {
            if (nombreNodo == nodo.getNombreNodo()) {
                return nodo;
            }
        }
        return null;
    }

    /**
     * El único proposito de este método es reasignar los supernodos que no existían cuando se registraban los nodos
     */
    public static void reasignarSupernodos(){
        for (Nodo nodo : nodos) {
            if (!nodo.isNodoSuperExiste()) {
                nodo.setNodoSuper(nodo.getNombreNodoSuper());
            }
        }
    }

    /**
     * Este método asigna los subnodos a la coleccion de subnodos de su correspondiente supernodo
     */
    public static void asignarSubnodos(){
        for (Nodo nodo : nodos) {
            nodo.getNodoSuper().addSubnodo(nodo);
        }
    }

    public static HashMap<String, Integer> hacerCaminos(){
        HashMap<String, Integer> caminos = new HashMap<>();
        for (Nodo nodo : nodos) {
            if (nodo.isHoja()) {
                caminos.put(nodo.getNombreNodo(), nodo.generarRuta(0));
            }
        }
        return caminos;
    }

    public static String buscarCaminoBarato(HashMap<String, Integer> caminos){
        String nodo = "";
        int precioMenor = 0;
        for (Map.Entry<String, Integer> entrada : caminos.entrySet()) {
            if (entrada.getValue() < precioMenor) {
                precioMenor = entrada.getValue();
                nodo = entrada.getKey();
            }
        }
        return nodo;
    }
}
