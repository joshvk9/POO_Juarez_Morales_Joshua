import javax.swing.*;
import java.util.*;

public class sueldoEmpleado{
    public int ID;
    public String Nombre;
    public double Num_Horas,Sueldo_Hora;
    
    sueldoEmpleado(int ID, int Num_Horas,String Nombre, double Sueldo_Hora)
    {
        this.ID = ID;
        this.Num_Horas = Num_Horas;
        this.Nombre = Nombre;
        this.Sueldo_Hora = Sueldo_Hora;
    }
    
    public void verEmpleado()
    {
        System.out.println("ID: "+ ID + " -- NOMBRE: "+ Nombre + " -- SUELDO HR: "+ Sueldo_Hora + " -- NUMERO HRs: "+ Num_Horas+"\n");
        System.out.println();
    }   
    
}

class Empleados{

    
    public static void main(String[] args) {

        int Captura_ID, Captura_Num_Horas,captura_Opcion,posicion_Empleados;
        String Captura_Nombre;
        double Captura_Sueldo_Hora;
        boolean Ciclo = true;
        sueldoEmpleado[] arregloEmpleados;
        arregloEmpleados = new  sueldoEmpleado[5];
        Scanner leer=new Scanner(System.in);
        posicion_Empleados = 0;
        while(Ciclo){
            
           System.out.print("Selecciona la opcion deseada:"
            + "\n 1.- Agregar nuevo empleado"
            + "\n 2.- Consultar empleado por ID"
            + "\n 3.- Consultar todos los empleados"
            + "\n 4.- Pagar al empleado por ID"
            + "\n 5.- Salir\nOpcion:");	
            captura_Opcion = leer.nextInt();

            switch(captura_Opcion) {
                    case 1:
                            if(posicion_Empleados < 5){
                                System.out.println("Agregar nuevo Empleado\n");
                                System.out.print("Introduce el ID del empleado:");
                                Captura_ID = leer.nextInt();
                                System.out.print("Introduce el numero de horas del empleado:");
                                Captura_Num_Horas = leer.nextInt();
                                System.out.print("Introduce el nombre del empleado:");
                                Captura_Nombre = leer.next();
                                System.out.print("Introduce el sueldo por hora del empleado:");
                                Captura_Sueldo_Hora = leer.nextDouble();

                                arregloEmpleados[posicion_Empleados] = new  sueldoEmpleado(Captura_ID,Captura_Num_Horas,
                                                                                        Captura_Nombre,Captura_Sueldo_Hora);
                                posicion_Empleados++;
                            }
                            else{
                                System.out.print("Se llego al numero maximo de empleados.");
                            }
                            break;
                    case 2:
                    
                            System.out.println("Buscar empleado por ID\n ");
                            System.out.print("Introduce el ID del empleado: ");
                            Captura_ID = leer.nextInt();
                            buscarIdsueldoEmpleadoo(Captura_ID,arregloEmpleados);
                            break;
                    case 3:
                            System.out.println("Mostrar informacion  de todos los empleados\n ");
                            for(int i = 0; i < 5; i++){
                                 arregloEmpleados[i].verEmpleado();
                            }
                            break;
                    case 4:
                            System.out.println("Mostrar pago");
                            System.out.print("Selecciona la opcion deseada:"
                            + "\n 1.- Pago quincenal"
                            + "\n 2.- Pago mensual\nOpcion: ");
                            captura_Opcion = leer.nextInt();
                            if(captura_Opcion == 1){
                                for(int i = 0; i < 5; i++){
                                    double sueldo_quincenal = (arregloEmpleados[i].Sueldo_Hora * arregloEmpleados[i].Num_Horas) * 15.0;
                                    System.out.println("El pago quincenal es de "+ arregloEmpleados[i].Nombre + " es de: $ "+ sueldo_quincenal + "\n");
                                }
                                
                            }
                            else{
                                for(int i = 0; i < 5; i++){
                                    double sueldo_mensual = (arregloEmpleados[i].Sueldo_Hora * arregloEmpleados[i].Num_Horas) * 30.0;
                                    System.out.println("El pago mensual es de  "+ arregloEmpleados[i].Nombre + " es de: $ "+ sueldo_mensual + "\n");
                                }
                            }
                            
                            break;
                    case 5:
                            Ciclo = false;
                            break;
      }

        }
        
    }
    
    private static void buscarIdsueldoEmpleadoo(int captura_id, sueldoEmpleado[] arregloEmpleados) {
    }

    public static int buscarIdEmpleado(int id, sueldoEmpleado[] empleados){
        for(int i = 0; i < 5; i++){
            if(empleados[i].ID == id){
                System.out.println("El empleado es: \n ");
                empleados[i].verEmpleado();
            }
        }
        return 0;
    }

}

 









      
         