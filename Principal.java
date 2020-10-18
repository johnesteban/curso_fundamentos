
import java.util.Scanner;
public class Principal
{

    public static void main(String[]args){
        System.out.println("***********************************************************************");
        System.out.println("*                              MENU                                   *");
        System.out.println("* 0-Salir del programa                                                *");
        System.out.println("* 1-Mostrar las posiciones libres del parqueadero                     *");
        System.out.println("* 2-Agregar un nuevo vehiculo omitiendo el valor comercial            *");
        System.out.println("* 3-Agregar un nuevo vehiculo sin omitir el valor comercial           *");
        System.out.println("* 4-Imprimir la informacion de todos los vehiculos parqueados         *");
        System.out.println("* 5-Mostrar la cantidad de vehiculos que han sido parqueados          *");
        System.out.println("* 6-Consultar el estado de un espacio (Libre u ocupado)               *");
        System.out.println("* 7-Mostrar el estado de todos los sensores                           *");
        System.out.println("* 8-Mostrar la informacion de los vehiculos de un color ingresado     *");
        System.out.println("* 9-Mostrar los vehiculos parqueados ordenados por su valor comercial *");
        System.out.println("***********************************************************************"+"\n");
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de espacios que tendra el parqueadero: ");
        int espacios=scan.nextInt();
        Vehiculo.vehiculos=new Vehiculo[espacios];
        Sensor.sensores=new Sensor[espacios];
        System.out.println("Ingrese la opcion que desea: ");
        int opcion=scan.nextInt();
        while(opcion!=0){
            switch(opcion){
                case 1:
                System.out.println("Las posiciones del parqueadero libres son:"+"\n"+Sensor.sensorLibre());
                break;
                case 2:
                System.out.println("Ingrese el espacio donde desea parquear: ");
                int n=scan.nextInt();

                if(n<0 || n>=espacios){
                    System.out.println("Espacio inexistente");
                }
                else if(Sensor.sensores[n]!=null){
                    System.out.println("El espacio esta ocupado, no se puede realizar la accion");
                }
                else {

                    System.out.println("Ingrese la placa: ");
                    String placa=scan.next();
                    System.out.println("Ingrese la marca: ");
                    String marca=scan.next();
                    System.out.println("Ingrese el color: ");
                    String color=scan.next();
                    Vehiculo.vehiculos[n]=new Vehiculo(placa,marca,color);
                    Sensor.sensores[n]=new Sensor(1);
                    System.out.println(Vehiculo.vehiculos[n].toString());
                } 
                break;

                case 3:
                System.out.println("Ingrese el espacio donde desea parquear: ");
                n=scan.nextInt();
                if(n<0 || n>=espacios){
                    System.out.println("Espacio inexistente");
                }
                else if(Sensor.sensores[n]!=null){
                    System.out.println("El espacio esta ocupado, no se puede realizar la accion");
                }
                else {
                    System.out.println("Ingrese la placa: ");
                    String placa1=scan.next();
                    System.out.println("Ingrese la marca: ");
                    String marca1=scan.next();
                    System.out.println("Ingrese el color: ");
                    String color1=scan.next();
                    System.out.println("Ingrese el valor comercial: ");
                    int valor=scan.nextInt();
                    Vehiculo.vehiculos[n]=new Vehiculo(placa1,marca1,color1,valor);
                    Sensor.sensores[n]=new Sensor(1);
                    System.out.println(Vehiculo.vehiculos[n].toString());
                }
                break;

                case 4:
                System.out.println(Vehiculo.toStringVehiculos());
                break;
                case 5:
                if(Vehiculo.cantidadVehiculos()==0){
                    System.out.println("Aun no hay vehiculos parqueados");
                }
                else{
                    System.out.println("La cantidad de vehiculos que han sido parqueados es: "+Vehiculo.cantidadVehiculos());
                }
                break;
                case 6:
                System.out.println("Ingrese el número del espacio que desea consultar: ");
                int espacio=scan.nextInt();
                if(espacio>=espacios || espacio<0){
                    System.out.println("El espacio es inexistente");
                }
                else if(Sensor.sensores[espacio]==null){
                    System.out.println("Libre");
                }
                else{
                    System.out.println(Sensor.sensores[espacio].toString());
                } 
                break;
                case 7:
                System.out.println("El estado de los sensores respecto a cada posición es:"+"\n"+Sensor.sensoresEstado());
                break;
                case 8:
                System.out.println("Ingrese el color del vehiculo: ");
                String color=scan.next();
                System.out.println(Vehiculo.toStringColor(color));
                break;
                case 9:
                if(Vehiculo.cantidad==0){
                    System.out.println("Aun no hay vehiculos parqueados");
                }
                else{
                    System.out.println("Los vehiculos ordenados de menor a mayor segun su valor comercial tienen el siguiente orden:"+"\n"+Vehiculo.ordenarValor());
                }
                break;
                default:
                System.out.println("Comando incorrecto");
                break;
            }
            System.out.println("Ingrese nuevamente una opcion: ");
            opcion=scan.nextInt();
        }

    }
}

