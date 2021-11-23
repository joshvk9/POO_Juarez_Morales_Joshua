public class Animales {
    /*vamos a crear un programa para guardar los datos de animales domesticos 
    */
    /* Encapsulamineto
    Es poder restringir el accero a los tipos de datos 
    Vamos a poder agrupar a una clase el acceso a los diferentes 
    metodos, atributos u objetos de clase, para que no puedan ser modificados ddesde otro lugar 
    */ 
    private String nombre, raza, tipo_alimento;
    private int edad;
    private bolean sexo;
    /* 
    Cuando estamos aplicando el escapsulamiento se debe de agregar los metodos 
    constructores 
    El constructor nos sirve para poder declarar la existencia de una clase para poder inicializar las variables de la clase 
    opara poder hace las instancia de las clases 
    */
    public Animal(){
        //esto es un constructor
        /* 
        Podemos inicalizar las vvariables 
        podemos aplicar la sobrecarga 

        */
    

    }

    Public Animal(String nombre, String raza, String tipo_alimento, int edad, boolean sexo){
        //Podemos realizar operaciones con cada uno de los parametros 
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
        this.sexo = sexo;

    }

    /*
    Cuando los atributos son de tipo privare:

    debemos de accdere a los datos a traves del uso de los metodos 
    get obtener -> recibir 
    set asignar -> enviar 
    */ 
    public String getNombre(){
        return nombre;
    }
    //enviar 
    public void setNombre(){
        this.Nombre = nombre;
    }

  
    




}
