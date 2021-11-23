
/*
Para poder aplicar la herencia de una clase, se utiliza la palabra reservada
extends 
esos significa qie ña cñase va a heredar de una clase padre

animal es la clase padre 
perro es la clase hija
*/

public class Perro extends animal {
    /*
    Aqui deberia de colacar cada atributo 
    nombre, raza, edad, tipo_alimento, sexo 
    */

    String ladString;

    Public Perro(){
        //constructor ded la clase

    }
    //sobrecarga para obtener y enviar el ladrido 
    public Perro(String nombre, String raza, string tipo_alimento,
    int edad, boolean sexo, String ladrido){
        //para poder obtener los atributos por herencia 
        //se debe de colocar super 
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.ladrido = ladrido; 
    }
    public String getladrido(){
        retun ladrido;    
    }
    //enviar
    public voud  setLadrido(){
        this.ladrido = ladrido;
    }
    
    //metodo para mostrar la informacion del perro 
    public void mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre() +"\n" + "Su raza es: " + getraza() +"\" + "se alimenta de " + ge)
    }




}
