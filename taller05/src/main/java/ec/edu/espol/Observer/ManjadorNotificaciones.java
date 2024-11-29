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
public class ManjadorNotificaciones {
    
    private List<Observer> observadores;

    public ManjadorNotificaciones() {
        this.observadores = new ArrayList<>();
    }

    // Agregar un nuevo observador
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    // Notificar a todos los observadores
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            System.out.println("Notificar a los observadores");
        }
    }
    
}
