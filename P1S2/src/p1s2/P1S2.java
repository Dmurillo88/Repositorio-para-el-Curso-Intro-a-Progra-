/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1s2;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class P1S2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Esto es un comentario, ej para Clase 2
        // i hope im not too late
        /**
         * Esto tambien es un comentario
         */
        int edad =20;
        double salario =10000.00;
        String texto ="Esto es un texto";
        
        System.out.println("Esto es un mensaje a nivel de consola");
        System.out.println(texto);
        
        texto=JOptionPane.showInputDialog("Solicito datos soy robot");
        JOptionPane.showMessageDialog(null,texto);
        //System.out.println(texto);
    }
    
}
