package ejercicioextra2;

import java.util.Objects;

/*
 * @author Abi Castro
 */
public class CantanteFamoso implements Comparable<CantanteFamoso>{
    
    private String nombre;
    private String discoMasVendido;

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + ". Disco Mas Vendido: " + discoMasVendido;
    }    

    @Override
    public int compareTo(CantanteFamoso otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.discoMasVendido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CantanteFamoso other = (CantanteFamoso) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.discoMasVendido, other.discoMasVendido)) {
            return false;
        }
        return true;
    }
    
    
}