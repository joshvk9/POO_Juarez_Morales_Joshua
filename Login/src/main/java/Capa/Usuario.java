/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa;

/**
 *
 * @author Joshua
 */
public class Usuario {
    private  String nick;
    private  String contraseña;
    private  String reango;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getReango() {
        return reango;
    }
    public static int verificarUsuarioNuevo(String usuario){
        vector lista = mostrar();
        usuario obj;
        for(int i=0;i<lista.size();i++){
            obj = (Usuario)lista.elementAt(i);
            if(obj.getNick().equalsIgnoreCase(usuario)){
                return i;
                
            }
        }return -1;
    }
    public static init verificarLogueo(String usuario, String contraseña){
        vector lista = mostrar();
        Usuario obj;
        for (int i = o; i < lista.size(); i++){
            obj = (Usuario) lista.elementAt(i);
            if(obj.getNick().equalsIgnoreCase(usuario) &&  obj.getContraseña().equalsIgnoreCase(contraseña)){
                return i;
        }
        }
        return -1;
    }
    
    public void setReango(String reango) {
        this.reango = reango;
    }
    public static vector mostrar(){
        return ListaUsuario.mostar();
        
        
    }
}
