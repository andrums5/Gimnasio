package gimnasio;

import java.io.Serializable;
import java.util.Objects;

public class Socios implements Serializable{

    private int numero;
    private String nombre;
    private String telefono;
    private Double cuota;
    private Boolean vip;

    public Socios(int numero, String nombre, String telefono, Double cuota, Boolean vip) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cuota = cuota;
        this.vip = vip;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
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
        final Socios other = (Socios) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Socios{" + "numero=" + numero + ", nombre=" + nombre + ", telefono=" + telefono + ", cuota=" + cuota + ", vip=" + vip + '}';
    }
    
    

    public Boolean isVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
