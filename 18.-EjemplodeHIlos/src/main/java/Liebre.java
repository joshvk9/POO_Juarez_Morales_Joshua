/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Joshua
 */
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

public class Liebre extends Thread {
    
    //metodo para que corra
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Avanza la liebre"+i);
            //cuando llegue a 100 se mime wiiii
            try{
                sleep(300);//recuerden son ms
            }catch(InterruptedException ex){
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Termino liebre");
    }
    
    
}
