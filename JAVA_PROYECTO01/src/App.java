import java.util.Scanner;

public class App {

    //eLEMENTOS NECESARIOS PARA TODAS LAS ACCIONES
    static Scanner scanner= new Scanner(System.in);
    static String[] planetas = {"MERCURIO", "VENUS", "MARTE", "JUPITER", "SATURNO", "URANO", "NEPTUNO"};
    static double[] distancias = {91.7, 42.4, 78.3, 628.9, 1284.4, 2721.4, 4345.4};
    
    static String[] naves = {"EXPLORER", "CARGUERO", "SPEEDER"};
    static double[] velocidad = {45000.0, 55000.0, 80000.0};
    //static double[] oxigenoPersona = 2;
    //static double[] gasHora = {1000, 800, 1200};
    //static double [] numeroPasajeros = {50, 200, 300};



    public static void main(String[] args) throws Exception {
       int opcion;
        do{
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    selecionarDestino();                   
                    break;
                case 2:
                    seleccionarNave();
                    break;
                case 3:
                    calcularRecursos();
                    break;
                case 4:
                    iniciarSimulacion();
                    break;
                
            
                default:
                    break;
            }


        }while(opcion != 5);
        System.out.println("******   ESTAS SALIENDO DEL SIMULADOR DE VIAJES ESPACIALES, GRACIAS POR TU PARTICIPACION   ******");

        
    }

    public static void mostrarMenu () {
        System.out.println("\n======MENU PRINCIPAL DE VIAJE=====");
        System.out.println("1. SELECCIONAR DESTINO");
        System.out.println("2. SELECCIONE UNA NAVE");
        System.out.println("3. GESTIONAR RECURSOS");
        System.out.println("4. INICIAR SIMULACION");
        System.out.println("5. SALIR");
        System.out.println("POR FAVOR, ELIGE UNA OPCION: ");

    }

    

    public static void seleccionarNave() {
        System.out.println("*****=====¡BIENVENIDO AL SIMULADOR DE VIAJES INTERPLANETARIOS!=====*****");
        System.out.println("======****** SELECCIONA UNA NAVE: ");

        for (int i = 0; i < naves.length; i++) {
            System.out.println((i+1) + ". " + naves[i]);
        }

        System.out.print("Ingresa el número de la NAVE: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= naves.length) {
            String naveSeleccionada = naves[opcion - 1];
            System.out.println("¡EXCELENTE OPCIÓN! TU NAVE ES:  " + naveSeleccionada + "  con una velocidad de: " + velocidad[opcion - 1] + "  Kilómetros por hora.");
        } else {
            System.out.println("Opción inválida. Por favor, selecciona un número del 1 al 3.");
        }
        
    }

    public static void selecionarDestino() {
        System.out.println("*****=====¡BIENVENIDO AL SIMULADOR DE VIAJES INTERPLANETARIOS!=====*****");
        System.out.println("SELECCIONA TU DESTINO: ");

        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i+1) + ". " + planetas[i]);
        }

        System.out.print("Ingresa el número del planeta: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= planetas.length) {
            String planetaDestino = planetas[opcion - 1];
            System.out.println("¡Excelente elección! Te diriges hacia:  " + planetaDestino + "  a una distancia de: " + distancias[opcion - 1] + "  Millones de Kilómetros.");
        } else {
            System.out.println("Opción inválida. Por favor, selecciona un número del 1 al 7.");
        } 
        

    }

    public static void calcularRecursos () {
        
       // horasViaje = distancias[opcion - 1] / velocidad[opcion - 1];
        //combustibleViaje = horasViaje * gasHora[];
        // oxigenoViaje = [2 * (2 * numeroPasajeros[opcion])] / [horasViaje / 24];


       // System.out.println("La NAVE " + naveSeleccionada + 
       //   "Necesita " + combustibleViaje + "Litros de combustible" + 
       // "Tambien " + oxigenoViaje + "Unidades de Oxigeno" + 
       //   "Para que su viaje sea Exitoso!"    );


    }

    public static void iniciarSimulacion () {

    }
}
