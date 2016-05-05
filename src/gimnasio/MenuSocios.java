package gimnasio;
import utilidades.EntradaDatos;
import utilidades.Fichero;

public class MenuSocios {

    int opcion;

    public MenuSocios() {
        
       

        do {
             mostrarMenu();
            opcion = EntradaDatos.pedirEntero("escribe la opcion deseada");
            switch (opcion) {
                case 1:
                    altaSocio();
                    break;
                case 2:
                    bajaSocio();
                    break;
                case 3:
                    modSocio();
                    break;
                case 4:
                    altaActSocio();
                    break;
                case 5:
                    BajaActSocio();
                    break;
                case 6:
                    socioVip();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (opcion != 0);
        

    }

    public static void mostrarMenu() {
        System.out.println("Elige una opcion del menu socios");
        System.out.println("1: Alta de socio");
        System.out.println("2: Baja de socio");
        System.out.println("3: modificar datos socio");
        System.out.println("4: Alta actividad socio");
        System.out.println("5: Baja actividad socio ");
        System.out.println("6: Alta baja socio VIP");
        System.out.println("0: Salir");

    }

    private void altaSocio() {
      boolean existe = false;
      int  numero;
      do{
      numero = EntradaDatos.pedirEntero("numero de socio");
      Socios aux = new Socios(0, "", "", 0.0,true);
      aux.setNumero(numero);
      existe = MenuPpal.losSocios.existeSocio(aux);
      if (existe){
          System.out.println("Ya hay un socio con este numero ");
      } 
      }while(existe);
      String nombre = EntradaDatos.pedirCadena("nombre del socio");
      String tel = EntradaDatos.pedirCadena("dime el numero de telefono");
      double cuota;
        do {
            cuota = EntradaDatos.pedirDouble("dime la cuota que pagara");
            if (cuota<10){
                System.out.println("la cuota tiene que ser como minimo de 10 euros");
            }
        } while (cuota<10);
        boolean vip = false;
        String respuesta = "";
        do{
        respuesta= EntradaDatos.pedirCadena("va a ser socio vip S/N?");
        if (respuesta.equalsIgnoreCase("s")){
            vip = true;
        }
        else if (respuesta.equalsIgnoreCase("n")) {
            vip = false;
                
            }
        else{
            System.out.println("respuesta incorrecta");
        }
        }while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
        Socios s = new Socios(numero, nombre, tel, cuota, vip);
        System.out.println(s);
        System.out.println(MenuPpal.losSocios);
        MenuPpal.losSocios.altaSocio(s);
        MenuPpal.ficheroSocios.grabar(MenuPpal.losSocios);  
    }
    private void bajaSocio() {
     
      int numero = EntradaDatos.pedirEntero("numero de socio");
      Socios aux = MenuPpal.losSocios.socioPorCodigo(numero);
      if (aux == null){
          System.out.println("no existe ningn socio con ese nmero");
      
      }
      else{
          String confirma;
          do {         
              System.out.println("datos del socio");
              System.out.println(aux);
              confirma = EntradaDatos.pedirCadena("estas seguro de borrar al usuario");
              if (confirma.equalsIgnoreCase("s")) {
                  MenuPpal.losSocios.bajasocio(aux);
                  MenuPpal.ficheroSocios.grabar(MenuPpal.losSocios);
                  System.out.println("socio borrado");
              }
              else if (confirma.equalsIgnoreCase("n")){
                  System.out.println("socio no borrado");
              }
              else{
                  System.out.println("respuesta incorrecta");   
              }
          } while (!confirma.equalsIgnoreCase("s") && confirma.equalsIgnoreCase("n"));
          
      }
      
    
        
    }

    private void modSocio() {
        
    }

    private void altaActSocio() {
        
    }

    private void BajaActSocio() {
        
    }

    private void socioVip() {
        boolean comprueba = true;
        int socio = EntradaDatos.pedirEntero("dame el numero de socio");
        Socios s = MenuPpal.losSocios.socioPorCodigo(socio);
        if(s == null){
            System.out.println("no existe ese socio");
        }
        else{
            if (s.isVip()){
                System.out.println("el socio es vip");
                System.out.println("quieres dar de baja el socio vip?");
                s.setVip(true);
            }
            else {
                    
            }
            
        
        }
        
    }
    
    
}
