/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.Facade;

import ec.edu.espol.FactoryMethod.Tarea;
import ec.edu.espol.FactoryMethod.TareaFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leo
 */
public class GestorDeTareas implements TareaManager { 
    private TareaFactory taskFactory; 
    private List<Tarea> tasks; 

    public GestorDeTareas(TareaFactory taskFactory) { 
        this.taskFactory = taskFactory; 
        this.tasks = new ArrayList<>(); 

    } 

    @Override
    public void crearTarea() {
        tasks.add(this.taskFactory.crearTarea());
    }

    @Override
    public List<Tarea> getTareas() {
        return tasks;
    }

    @Override
    public void updateTarea(Tarea tarea) {
     // Implementación de actualización de tarea 
    }

    @Override
    public void deleteTarea(Tarea tarea) {
        // Implementación de eliminación de tarea
    }
}
