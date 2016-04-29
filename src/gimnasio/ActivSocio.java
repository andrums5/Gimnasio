package gimnasio;

import java.util.Objects;

public class ActivSocio {

    private String nombreactiv;
    private String numsocio;

    public ActivSocio(String nombreactiv, String numsocio) {
        this.nombreactiv = nombreactiv;
        this.numsocio = numsocio;
    }

    @Override
    public String toString() {
        return "ActivSocio{" + "nombreactiv=" + nombreactiv + ", numsocio=" + numsocio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final ActivSocio other = (ActivSocio) obj;
        if (!Objects.equals(this.nombreactiv, other.nombreactiv)) {
            return false;
        }
        if (!Objects.equals(this.numsocio, other.numsocio)) {
            return false;
        }
        return true;
    }
    
    public String getNumsocio() {
        return numsocio;
    }

    public void setNumsocio(String numsocio) {
        this.numsocio = numsocio;
    }


    public String getNombreactiv() {
        return nombreactiv;
    }

    public void setNombreactiv(String nombreactiv) {
        this.nombreactiv = nombreactiv;
    }

}
