package ec.edu.Facade;

import ec.edu.espol.FactoryMethod.Tarea;
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

} 