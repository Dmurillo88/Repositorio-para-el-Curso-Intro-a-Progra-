/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1s8;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class P1S8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arreglo1[] = new String[5];
        JOptionPane.showMessageDialog(null,arreglo1[0]);
        JOptionPane.showMessageDialog(null,arreglo1[1]);
        JOptionPane.showMessageDialog(null,arreglo1[2]);
        JOptionPane.showMessageDialog(null,arreglo1[3]);
        JOptionPane.showMessageDialog(null,arreglo1[4]);
        JOptionPane.showMessageDialog(null,arreglo1[5]);
        
        for (int i=0; i< arreglo1.length; i++) {
        arreglo1[i]="a"+i;
    }
        
    }
    
}
