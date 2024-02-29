package modelos;

import java.util.HashSet;

public class Nodo {

    private String nombreNodo;
    private String nodoSuper;
    private int costeNodo;
    private HashSet<String> subNodos;
    private boolean raiz;

    public Nodo(String nodoSuper, String nombreNodo, int costeNodo) {
        setNodoSuper(nodoSuper);
        setNombreNodo(nombreNodo);
        setCosteNodo(costeNodo);
        subNodos = new HashSet<>();
        if (nodoSuper == nombreNodo) {
            raiz = true;
        }
    }

    public String getNombreNodo() {
        return nombreNodo;
    }

    public void setNombreNodo(String nombreNodo) {
        this.nombreNodo = nombreNodo;
    }

    public String getNodoSuper() {
        return nodoSuper;
    }

    public void setNodoSuper(String nodoSuper) {
        this.nodoSuper = nodoSuper;
    }

    public int getCosteNodo() {
        return costeNodo;
    }

    public void setCosteNodo(int costeNodo) {
        this.costeNodo = costeNodo;
    }

    public HashSet<String> getSubNodos() {
        return subNodos;
    }

    public void addSubnodo(String subNodo) {
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
        return raiz;
    }


    
    
}
