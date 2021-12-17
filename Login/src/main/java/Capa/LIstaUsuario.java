/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa;
import java.util.Vector;
/**
 *
 * @author Joshua
 */
public class LIstaUsuario {
    private satatic Vector<Usuario> datos = new Vector<Usuario>();
    public static void Agregar(Usuario obj){
        datos.addElement(obj);
        
    }
    
    public static void eliminar(int pos){
        datos.moveElementAt(pos);
        
    }
    public static Vector motrar(){
        return datos;
        
    }
}
