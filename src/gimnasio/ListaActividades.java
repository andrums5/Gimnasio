package gimnasio;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaActividades implements Serializable {

    private ArrayList<ActividadesGym> listactiv;

    public ListaActividades() {
        listactiv = new ArrayList<>();
    }

    // añadimos actividad a la listactiv
    public void altactiv(ActividadesGym a) {
        listactiv.add(a);
    }

    // eliminamos actividad
    public void bajactiv(ActividadesGym a) {
        listactiv.remove(a);
    }

    //cantidad elementos array
    public int cantidad() {
        return listactiv.size();
    }

    //posicion de una actividad en el array
    public ActividadesGym obtenerActividad(int posicion) {
        return listactiv.get(posicion);
    }

    public ActividadesGym ativPorCodigo(String codigo) {
        for (ActividadesGym a : listactiv) {
            if (a.getNombreAciv().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }
    public boolean existeactiv (ActividadesGym a){
    return listactiv.contains(a);
    }

    public ArrayList<ActividadesGym> getListactiv() {
        return listactiv;
    }

    public void setListactiv(ArrayList<ActividadesGym> listactiv) {
        this.listactiv = listactiv;
    }

}
