
package gimnasio;

import java.io.Serializable;
import java.util.Objects;


public class ActividadesGym implements Serializable{
    
    private String nombreaciv;    
    private int maxasist;
    private int sociosinscrtos;
    private String precioactiv;

    public ActividadesGym(String nombreaciv, int maxasist, int sociosinscrtos, String precioactiv) {
        this.nombreaciv = nombreaciv;
        this.maxasist = maxasist;
        this.sociosinscrtos = sociosinscrtos;
        this.precioactiv = precioactiv;
    }

    @Override
    public String toString() {
        return "ActividadesGym{" + "nombreaciv=" + nombreaciv + ", maxasist=" + maxasist + ", sociosinscrtos=" + sociosinscrtos + ", precioactiv=" + precioactiv + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ActividadesGym other = (ActividadesGym) obj;
        if (!Objects.equals(this.nombreaciv, other.nombreaciv)) {
            return false;
        }
        return true;
    }
    
    public String getPrecioActiv() {
        return precioactiv;
    }

   
    public void setPrecioActiv(String precioActiv) {
        this.precioactiv = precioActiv;
    }


    public int getSociosInscrtos() {
        return sociosinscrtos;
    }

    public void setSociosInscrtos(int sociosInscrtos) {
        this.sociosinscrtos = sociosInscrtos;
    }


    public int getMaxAsist() {
        return maxasist;
    }

    public void setMaxAsist(int maxAsist) {
        this.maxasist = maxAsist;
    }


    public String getNombreAciv() {
        return nombreaciv;
    }

    public void setNombreAciv(String nombreAciv) {
        this.nombreaciv = nombreAciv;
    }

    
}
