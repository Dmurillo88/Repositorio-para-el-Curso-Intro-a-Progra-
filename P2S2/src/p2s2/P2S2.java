/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2s2;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class P2S2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Escriba un programa que lea el nombre del trabajador y su salario semanal, con esta información
            calcule su salario mensual sin deducciones (salario bruto), el monto de las deducciones (que
            corresponden a un 9.34%) y el salario después de aplicadas las deducciones (salario neto), finalmente
            debe mostrar los datos al usuario de la siguiente manera.
            Estimado <<nombre>>, el salario de este mes se desglosa de la siguiente manera.
            Salario bruto: #####.##
            Deducciones: #####.##
            Salario Neto: #####.##
        */
        
        String nombreTrabajador ="";
        double salarioSemanal =0.0;
        double salarioMensual =0.0;
        double salarioMensualDed =0.0;
        String variableTemporal ="";
        nombreTrabajador= JOptionPane.showInputDialog("Digite su nombre");
        variableTemporal= JOptionPane.showInputDialog("Digite su salario semanal");
        salarioSemanal=Double.parseDouble(variableTemporal);
        salarioMensual=salarioSemanal*4;
        salarioMensualDed= salarioMensual-salarioMensual*0.0934;
        
        JOptionPane.showMessageDialog(null,"Su nombre es: "+ nombreTrabajador +"\n" +
                                           "Su salario es: "+ salarioSemanal +"\n" +
                                           "Su salario mensual (bruto) es: "+ salarioMensual + "\n" +
                                           "Su salario mensual (con deducciones) es: "+salarioMensualDed);
        
        //Clase 2: Operadores Logicos 
        
        boolean bandera= true;
        int edad= 0; 
        
        if (bandera){
            JOptionPane.showMessageDialog(null,"True");
            } else {
             JOptionPane.showMessageDialog(null,"False");
        }
        edad= Integer.parseInt(JOptionPane.showInputDialog("Dime tu edad"));
        if (edad >=18){
            boolean hola=true;
            JOptionPane.showMessageDialog(null,"Tomar alcohol");
            JOptionPane.showMessageDialog(null, "Casarse");
            if (edad >65){
                JOptionPane.showMessageDialog(null,"Pensionado con el maestro Roshi");
            } else
              JOptionPane.showMessageDialog(null,"Olbigado a trabajar para poder comer");
        }
        if (true)
            JOptionPane.showMessageDialog(null,"Casarse");
        else
            JOptionPane.showMessageDialog(null,"jaja");
    }
}
