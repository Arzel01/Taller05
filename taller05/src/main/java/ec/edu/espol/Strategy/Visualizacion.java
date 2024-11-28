package ec.edu.espol.Strategy;

import java.util.List;
import ec.edu.espol.FactoryMethod.Tarea;

public class Visualizacion {
    private VisualizacionEstrategia estrategia;

    public void setEstrategia(VisualizacionEstrategia ve){
        this.estrategia = ve;
    }
    public void mostrarTareas(List<Tarea> tareas){
        estrategia.ejecutar(tareas);
    }
}
