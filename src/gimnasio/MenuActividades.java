
package gimnasio;

import utilidades.EntradaDatos;


public class MenuActividades {
 int opcion;
    public MenuActividades(){
    mostrarMenu();
    opcion = EntradaDatos.pedirEntero("escribe la opcion deseada");
            
    do{
    switch(opcion){
        case 1: break;
        case 2: break;
        case 3: break;
        case 0: break;
        default:
            System.out.println("opcion incorrecta");
        
    }
    }while(opcion != 0);
     MenuPpal m = new MenuPpal();
}
    public static void mostrarMenu(){
        System.out.println("Elige una opcion de actividades");
        System.out.println("1: Alta de actividad");
        System.out.println("2: Baja de actividad");
        System.out.println("3: modificar actividad");
        System.out.println("0: Salir");    
           
    }   
}
