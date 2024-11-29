/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.Observer;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ricky
 */
public class Tarea {
    
    private String fechaVencimiento;

    public Tarea(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    public void notificar() {
        System.out.println("Se notifico de la fecha de vencimiento");
    }
    
    public void actualizarFechaVencimiento(){
        System.out.println("Se actualizo la fecha de nacimiento");
    }
   
    
    public void establecerFechaVencimiento(String fecha) {
        this.fechaVencimiento = fecha;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
}
