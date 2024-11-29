/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.Observer;

/**
 *
 * @author ricky
 */
public class notificatorEmail implements Observer {
    private String correo;

    public notificatorEmail(String correo) {
        this.correo = correo;
    }

    @Override
    public void actualizar(Tarea tarea) {
       
            System.out.println("Enviando correo a " + correo + ": La tarea está completada.");
    }
}
