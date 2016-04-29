package gimnasio;

import utilidades.EntradaDatos;


public class MenuConsultas {
    int opcion;
    public MenuConsultas(){
    mostrarMenu();
    opcion = EntradaDatos.pedirEntero("escribe la opcion deseada");
            
    do{
    switch(opcion){
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 6: break;
        case 0: break;
        default:
            System.out.println("opcion incorrecta");
        
    }
    }while(opcion != 0);
     MenuPpal m = new MenuPpal();
}
    public static void mostrarMenu(){
        System.out.println("Elige una opcion de consultas");
        System.out.println("1: Listado de socios");
        System.out.println("2: Listado de actividades");
        System.out.println("3: Listado de actividades/socio");
        System.out.println("4: Listado de ingresos gimnasio totales");
        System.out.println("5: Listado de igrasos por actividad");
        System.out.println("6: Listado de plazas vacantes por actividad");
        System.out.println("0: Salir");    
           
    }
    
}
