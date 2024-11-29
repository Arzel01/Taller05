/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.Observer;

/**
 *
 * @author ricky
 */
public class notificatorSMS implements Observer{
    
    private String telefono;

    public notificatorSMS(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void actualizar(Tarea tarea) {
     
        System.out.println("Enviando SMS a " + telefono + ": La tarea está completada.");
    }
   
}
