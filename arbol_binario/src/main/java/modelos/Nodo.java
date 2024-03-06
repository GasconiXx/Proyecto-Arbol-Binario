package modelos;

import java.util.HashSet;

import gestores.GestorNodos;

public class Nodo {

    private String nombreNodo;
    private String nombreNodoSuper;
    private Nodo nodoSuper;
    private int costeNodo;
    private HashSet<Nodo> subNodos;
    private boolean nodoSuperExiste;

    public Nodo(String nombreNodoSuper, String nombreNodo, int costeNodo) {
        setNombreNodoSuper(nombreNodoSuper);
        setNombreNodo(nombreNodo);
        setCosteNodo(costeNodo);
        subNodos = new HashSet<>();
        if (nombreNodoSuper == nombreNodo) {
            nodoSuper = null;
            nodoSuperExiste = false;
        } else {
            setNodoSuper(nombreNodoSuper);
        }
    }

    public void setNodoSuper(String nombreNodoSuper){
        if (GestorNodos.buscarNodo(nombreNodoSuper) != null) {
           this.nodoSuper = GestorNodos.buscarNodo(nombreNodoSuper);
           this.nodoSuperExiste = true; 
        } else {
            this.nodoSuperExiste = false;
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

    public void setNodoSuper(Nodo nodoSuper) {
        this.nodoSuper = nodoSuper;
    }

    public void setSubNodos(HashSet<Nodo> subNodos) {
        this.subNodos = subNodos;
    }

    public boolean isNodoSuperExiste() {
        return nodoSuperExiste;
    }

    public void setNodoSuperExiste(boolean nodoSuperExiste) {
        this.nodoSuperExiste = nodoSuperExiste;
    }

    public String getNombreNodoSuper() {
        return nombreNodoSuper;
    }

    public void setNombreNodoSuper(String nombreNodoSuper) {
        this.nombreNodoSuper = nombreNodoSuper;
    }
    
    
}
