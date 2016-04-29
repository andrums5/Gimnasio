package gimnasio;

import utilidades.EntradaDatos;

public class MenuPpal {
    int opcion;
    public MenuPpal(){
    mostrarMenu();
    opcion = EntradaDatos.pedirEntero("escribe la opcion deseada");
            
    do{
    switch(opcion){
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
    }while(opcion != 0);
}
    public static void mostrarMenu(){
        System.out.println("Elige una opcion del menu principal");
        System.out.println("1: Menu de socios");
        System.out.println("2: Menu de actividades");
        System.out.println("3: Menu de Consultas");
        System.out.println("0: Salir");    
           
    }
}
