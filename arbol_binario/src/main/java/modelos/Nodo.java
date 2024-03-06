package modelos;

import java.util.HashSet;

public class Nodo {

    private String nombreNodo;
    private Nodo nodoSuper;
    private int costeNodo;
    private HashSet<Nodo> subNodos;

    public Nodo(Nodo nodoSuper, String nombreNodo, int costeNodo) {
        setNodoSuper(nodoSuper);
        setNombreNodo(nombreNodo);
        setCosteNodo(costeNodo);
        subNodos = new HashSet<>();
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

    public void setNodoSuper(Nodo nodoSuper) {
        this.nodoSuper = nodoSuper;
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
