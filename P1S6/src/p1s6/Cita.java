/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1s6;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
   public class Cita {
            private String persona;
            private Date fecha;
            private int espacio;

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
            
            
           public void crearCita1(){
               persona="Juan Cita 1";
               Date fechaHoy=new Date();
               JOptionPane.showMessageDialog(null,"Esta es la fecha de hoy" + fechaHoy);
               

               
    
 