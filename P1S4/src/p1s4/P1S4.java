/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1s4;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class P1S4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salida=false;
        do {            
            JOptionPane.showMessageDialog(null,"Valor de la variable salida:"+salida);
            for (int i = 0; i < 3; i++) {
               JOptionPane.showMessageDialog(null,"Valor de la variable es:" +i );
                       if (i==2){
                    salida=false;
                  }
                }
        } while (salida);
    }
    
}
