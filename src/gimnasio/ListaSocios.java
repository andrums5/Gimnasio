
package gimnasio;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaSocios implements Serializable{
    
    private ArrayList<Socios> listasocio;
    //preguntar si es el constructor y porque es asi
    public ListaSocios() {
        listasocio = new ArrayList<>();
    }
    //añade un socio a la lista
    public void altaSocio(Socios s){
        listasocio.add(s);
    }
    //para borrar socio de la lista
    public void bajasocio(Socios s){
        listasocio.remove(s);
    }
    //numero de socios, cuenta las posiciones del array
    public int numeroSocios(){
        return listasocio.size();
    }
    //devuelve la posicion del Socio en el array como parametro
    public Socios obtenerSocio(int posicion){
    return listasocio.get(posicion);
    }
    //metodo por codigo devuelve el socio
    public Socios socioPorCodigo(int codigo){
        for(Socios s : listasocio){
            if(s.getNumero()==codigo){
                return s;
            }
        }
        return null;
    }
    //comprueba si existe un socio con el mismo codigo 
    public boolean existeSocio (Socios s){
        return listasocio.contains(s);
    }
    
    public ArrayList<Socios> getListasocio() {
        return listasocio;
    }

    public void setListasocio(ArrayList<Socios> listasocio) {
        this.listasocio = listasocio;
    }

    
    
    
}
