/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._ejemplocolaborativo;

/**
 *
 * @author Joshua
 */
public class persona {
    
    private int id;
    private String nombre, appat, appmat;
    public persona(){
        
    }

    public persona(int id, String nombre, String appat, String appmat) {
        this.id = id;
        this.nombre = nombre;
        this.appat = appat;
        this.appmat = appmat;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getAppmat() {
        return appmat;
    }

    public void setAppmat(String appmat) {
        this.appmat = appmat;
    }
    
    
}
