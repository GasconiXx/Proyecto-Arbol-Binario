package modelos;

import java.util.HashSet;

import gestores.GestorNodos;

public class Nodo {

    private String nombreNodo;
    private Nodo nodoSuper;
    private int costeNodo;
    private HashSet<Nodo> subNodos;
    private boolean nodoSuper;

    public Nodo(String nombreNodoSuper, String nombreNodo, int costeNodo) {

        setNombreNodo(nombreNodo);
        setCosteNodo(costeNodo);
        subNodos = new HashSet<>();
        if (nombreNodoSuper == nombreNodo) {
            nodoSuper = null;
        } else {
            setNodoSuper(nombreNodoSuper);
        }
    }

    public void setNodoSuper(String nombreNodoSuper){
        if (GestorNodos.buscarNodo(nombreNodoSuper) != null) {
            
        }
    }

    public String getNombreNodo() {
        return nombreNodo;
    }

    public void setNombreNodo(String nombreNodo) {
        this.nombreNodo = nombreNodo;
    }

    public Nodo getNodoSuper() {
        return nodoSuper;
    }



    public int getCosteNodo() {
        return costeNodo;
    }

    public void setCosteNodo(int costeNodo) {
        this.costeNodo = costeNodo;
    }

    public HashSet<Nodo> getSubNodos() {
        return subNodos;
    }

    public void addSubnodo(Nodo subNodo) {
        subNodos.add(subNodo);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreNodo == null) ? 0 : nombreNodo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nodo other = (Nodo) obj;
        if (nombreNodo == null) {
            if (other.nombreNodo != null)
                return false;
        } else if (!nombreNodo.equals(other.nombreNodo))
            return false;
        return true;
    }

    public boolean isRaiz() {
        return nodoSuper.nombreNodo.equals(nombreNodo);
    }

    public boolean isHoja(){
        return subNodos.size() == 0;
    }
    
    
}
