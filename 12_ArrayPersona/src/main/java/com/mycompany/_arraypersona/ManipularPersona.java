/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._arraypersona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ManipularPersona {
    Scanner entrada = new Scanner(System.in);
    
    int opcion;
    
    //instancia de la clase controladorpersona 
    ControladoPersona crud = new ControladoPersona();
    //metodos principal del menu
    
    public void Principal(){
        do{
            System.out.print("Bienvenido a NetBeans");
            System.out.print("Por FAvor elige una opcion del siguiente menu:"
                    + "\n 1.- Mostrar lista del Personal"
                    + "\n 2.- Registrar uns nueva Persona"
                    + "\n 3.- Editar los datos de una persona"
                    + "\n 4.- Borrar el registro de una persona"
                    + "\n 5.- salir");
           opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ArrayList<Persona> listadepersonas = crud.mostrarPersonas();
                    //recorro el objeto de persona para mostrarlo
                    for(Persona objeto : listadepersonas){
                        System.out.print("El id : " + objeto.getId() 
                                        + "El nombre es: " + objeto.getNombre()
                                        + "La edad es: " + objeto.getEdad()
                                        +"\n");
                    }
                    
                    break;
                case 2:
                    System.out.print("Ingresa el id de la persona: ");
                    int idpersona = entrada.nextInt();
                    System.out.print("Ingresa el nombre de la persona");
                    String nombrepersona = entrada.nextLine();
                    System.out.print("Ingres la edad de la persona");
                    int edadpersona = entrada.nextInt();
                    
                    //enviar los nuevo datos a mi lista de personas
                    
                    Persona nuevapersona = new Persona(idpersona, 
                            nombrepersona, edadpersona);
                    
                    crud.registrarPersona(nuevapersona);
                    
                    break;
                case 3:
                    //primero busco 
                    System.out.println("Ingresa el ID de la persona que desea actualizar ");
                    int id = entrada.nextInt();
                    Persona personaSeleccionada = crud.buscarPersona(id);
                    //mostrar los datos 
                    System.out.println("La inforfmacion de la persona es: ");
                    System.out.println("Id: " + personaSeleccionada.getId()
                                            + "\n Nombre: " + personaSeleccionada.getNombre()
                                            + "\n Edad: " + personaSeleccionada.getEdad() + "\n");
                    
                    //ingreso los cambios
                    
                    System.out.println("Ingresa el nuevo nombre para le registro: ");
                    String nuevonombre = entrada.nextLine();
                    System.out.println("ingresa la nueva edad para el registro: ");
                    int nuevaedad = entrada.nextInt();
                    //envio los datos nuevos 
                    personaSeleccionada.setNombre(nuevonombre);
                    personaSeleccionada.setEdad(nuevaedad);
                    crud.actualizarPersona(personaSeleccionada);
                    
                    break;
                case 4:
                    System.out.print("Ingresa el Id de la persona a borrar:   ");
                    int ideliminar = entrada.nextInt();
                    
                    Persona personaEliminar = crud.buscarPersona(ideliminar);
                    
                    crud.eliminarPersona(personaEliminar);
                    System.out.print("Registro eliminado");
                    break;
                case 5:
                    System.exit(1);
                    break;
         
                default:
                    System.out.println("Digite una opcion valida");
        
            }
        }while(opcion != 5);
        
        
    }

    
}
