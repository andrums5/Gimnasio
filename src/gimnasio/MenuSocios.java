
package gimnasio;

import utilidades.EntradaDatos;


public class MenuSocios {
  
    int opcion;
    public MenuSocios(){
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
        System.out.println("Elige una opcion del menu socios");
        System.out.println("1: Alta de socio");
        System.out.println("2: Baja de socio");
        System.out.println("3: modificar datos socio");
        System.out.println("4: Alta actividad socio");
        System.out.println("5: Baja actividad socio ");
        System.out.println("6: Alta baja socio VIP");
        System.out.println("0: Salir");    
           
    }
}

