
package gimnasio;

import java.io.Serializable;
import java.util.ArrayList;


public class ListaActivSocio implements Serializable{
    
    private ArrayList<ActivSocio> listaActvSocio;
    
    public ListaActivSocio(){
    listaActvSocio = new ArrayList<>();
    }
    
    //metodo para añadir al array lis objeto
    public void altaActivSocio(ActivSocio a){
        listaActvSocio.add(a);
    }
    //borrar del array objeto
    public void bajaActivSocio(ActivSocio a){
         listaActvSocio.remove(a);
    }
    public int cantidad (){
        return listaActvSocio.size();
    }
    public ActivSocio obtenerAtivSocio (int posicion){
        return listaActvSocio.get(posicion);
    }
    
    
    public ArrayList<ActivSocio> getListaActvSocio() {
        return listaActvSocio;
    }

    public void setListaActvSocio(ArrayList<ActivSocio> listaActvSocio) {
        this.listaActvSocio = listaActvSocio;
    }

    
}
