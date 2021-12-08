
package com.mycompany.mi_primer_ventana.Login;

//librerias 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joshua
 */
public class login extends JFrame implements ActionListener{
    //componentes 
    private JLabel Texto,Texto2;
    private JTextField Text1;
    private JPasswordField text2;
    private JButton Boton1, Boton2, Boton3;
    private JOptionPane panel;
    private Object uruario;
    private Object contra;
    
    
    public login(){
        setLayout(null);
        
        Texto = new JLabel("Usuario");
        Texto.setBounds(10,20,100,20);
        add(Texto2);
        
        
        Texto2 = new JLabel("Contraseña");
        Texto2.setBounds(120,10,150,20);
        add(Texto2);
        
        Text1 = new JTextField();
        Text1.setBounds(120,10,150,20);
        add(Text1);
        
        text2 = new JPasswordField();
        text2.setBounds(120,50,150,20);
        add(text2);
        
        Boton1 = new JButton("Aceptar");
        Boton1.setBounds(40,100,100,30);
        add(Boton1);
        Boton1.addActionListener(this);
        
        Boton2 = new JButton("Limpiar");
        Boton2.setBounds(150,100,100,30);
        add(Boton2);
        Boton2.addActionListener(this);
        
        
        Boton3 = new JButton("Salir");
        Boton3.setBounds(260,100,100,30);
        add(Boton3);
        Boton3.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Boton1){
            String usuario = Text1.getText();
           String contra = text2.getText();
           
           if(usuario.isEmpty() || contra.isEmpty()){
               JOptionPane.showMessageDialog(null, "Algun Campo esta vacio");
     
           }
        }else{
            if(uruario.equals("usuariol") && contra.equals("1234")){
                JOptionPane.showMessageDialog(null, "Bienvenidos"); 
            }
               
        }
        
        if(e.getSource()==Boton2){
            Text1.setText("");
            text2.setText("");
        
        }
        if(e.getSource()== Boton3){
          this.dispose();
        }
        }
   
}

