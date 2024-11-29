package ec.edu.espol.Facade;

import ec.edu.espol.FactoryMethod.Tarea;
import ec.edu.espol.Observer.Observer;
import ec.edu.espol.Strategy.Visualizacion;
import java.util.List;
/**
 *
 * @author Leo
 */
public interface TareaManager {
    void crearTarea(); 
    List<Tarea> getTareas(); 
    void updateTarea(Tarea tarea); 
    void deleteTarea(Tarea tarea);
    void sucribirse(Observer observer);
    void desucribirse(Observer observer);
    void visualizarTareas(Visualizacion visualizacion);
} 