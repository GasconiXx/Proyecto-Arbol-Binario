package gestores;

import java.util.HashSet;

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

    public static void reasignarSupernodos(){
        for (Nodo nodo : nodos) {
            if (!nodo.isNodoSuperExiste()) {
                nodo.setNodoSuper(nodo.getNombreNodoSuper());
            }
        }
    }//:)

    public static void asignarSubnodos(){
        for (Nodo nodo : nodos) {
            nodo.getNodoSuper().addSubnodo(nodo);
        }
    }
}
