/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3s2;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class P3S2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad =0;
        edad= Integer.parseInt(JOptionPane.showInputDialog("Dime tu edad"));
        if (edad >=18){
          JOptionPane.showMessageDialog(null,"Tomar y Votar");
        }  
        else
         JOptionPane.showMessageDialog(null,"Muy joven!");
        
        int nota =0;
        nota= Integer.parseInt(JOptionPane.showInputDialog("Dime tu nota"));
        if (nota >=70) {
            JOptionPane.showMessageDialog(null,"Has aprobado");
        }
        else
            JOptionPane.showMessageDialog(null,"Has reprobado");
        }
        
        
    
 }
