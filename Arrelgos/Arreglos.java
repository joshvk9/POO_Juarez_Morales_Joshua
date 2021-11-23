import java.util.Scanner;
import java.util.scanner;

public class Arreglos{
    public static void main(String[]args{
        int aprobados=0;
        int reprobados=0;
        int excelentes=0;
        float calif=0;

        int i=1;
        Scanner sc=new Scanner(System.in);
        while(i<=10){
            
            System.out.println("Intrudizca una calificación del 0 al 10: ");
            calif=sc.nextFloat();
            if(Calif >= 9 && calif <= 10){
                excelentes++;
            }
            else if(calif>=6){
                aprobados++;
            }
            else{
                reprobados++;
                i++;
            }
            System.out.println("Cantidad de alumnos aprobados:  " + aprobados);
            System.out.println("Cantidad de alumnos reprobados:  " + reprobados);
            System.out.println("Cantidad de alumnos excelente:  " + excelentes);

        }        
    }
}