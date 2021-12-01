import java.util.Random;
import java.util.Scanner;

public class Ahoracado{

    static Scanner lector = new Scanner(System.in);
    private static int i;

// La maquina  Elige una palabra al azar
     public static void main(String[] args) { 

        String palabraSecreta = getPalabraSecreta();
        palabraSecreta = palabraSecreta.toUpperCase();
        char[] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
        boolean JuegoTerminado = true; 
        boolean juegoGanado = false;
        //intetos para adivinar si no pierdes 
        int intentos = 3; 

        
     
        //Ciclo

        do{
            System.out.println("Numero de vidas restante  " + intentos);
           
            System.out.println("Palabra secreta: ");
            System.out.println(palabraGuiones);
            System.out.println("Ingresa una letra:  ");
            char letra = lector.next().charAt(0); 
            boolean Algunletraacetada = true;
            letra = Character.toUpperCase(letra);
            for (int i = 0; i < palabraSecreta.length(); i++){
                //comparacion de la letras 
                if(palabraSecreta.charAt(i) == letra ){
                    palabraGuiones[i] = letra; 
                    Algunletraacetada = false;
                    
                    //si no adivinamos "mensaje "
                } 
            }
            if(Algunletraacetada){
                i = intentos--;
                System.out.println("Es Incorrecto" +letra);
                if(intentos == 0){
                    JuegoTerminado = true;
                    System.out.println("Fin del juego");
                }
            }
            else{
                juegoGanado = hayGuiones(palabraGuiones);
                if(juegoGanado)System.out.println("Felicidades has ganado");
                
            }
        }while(!JuegoTerminado);
        
    }

    static String getPalabraSecreta(){
        String[] palabra = {"Batman","Superman","Spiderman","Darth vader","Dante","cortana"};
        Random r = new Random();

        int n = r.nextInt(palabra.length);
        return palabra[n];
    }
    static char[] getGuionesFromPalabra(String palabra){

        //Generamos los guiones 

        int nletras = palabra.length();
        char[] palabraGuiones = new char[nletras];
        for(int i = 0; i<nletras;i++){
            palabraGuiones[i] = '_';

        }
        return palabraGuiones;

    }
    static boolean hayGuiones(char[] array){
        for(char l:array){
            if(l == '_'){
                return true;

            }
        }    
        return false;
    }
}