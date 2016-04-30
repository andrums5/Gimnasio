package gimnasio;
import utilidades.EntradaDatos;
import utilidades.Fichero;

public class MenuPpal {
    public Fichero ficheroSocios;
    public Fichero ficheroActiv;
    public Fichero ficheroActivSoc;
    public ListaActivSocio listaActivSoc;
    public ListaActividades listActiv;
    public ListaSocios losSocios;

    public MenuPpal() {
        ficheroSocios = new Fichero("fsocios.xml");
        ficheroActiv = new Fichero("factividad.xml");
        ficheroActivSoc = new Fichero("fsocioactiv.xml");
        losSocios = (ListaSocios)ficheroSocios.leer();
        listActiv = (ListaActividades)ficheroActiv.leer();
        listaActivSoc = (ListaActivSocio) ficheroActivSoc.leer();
        if (losSocios==null) {
            losSocios = new ListaSocios();
        }
        else if(listActiv==null){
            listActiv = new ListaActividades();
        }
        else if (listaActivSoc==null) {
            listaActivSoc = new ListaActivSocio();
        }
        int opcion;
        do {
            mostrarMenu();
            opcion = EntradaDatos.pedirEntero("escribe la opcion deseada");
            switch (opcion) {
                case 1:
                    MenuSocios m = new MenuSocios();
                    break;
                case 2:
                    MenuActividades a = new MenuActividades();
                    break;
                case 3:
                    MenuConsultas c = new MenuConsultas();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("opcion incorrecta");

            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("Elige una opcion del menu principal");
        System.out.println("1: Menu de socios");
        System.out.println("2: Menu de actividades");
        System.out.println("3: Menu de Consultas");
        System.out.println("0: Salir");

    }
}
