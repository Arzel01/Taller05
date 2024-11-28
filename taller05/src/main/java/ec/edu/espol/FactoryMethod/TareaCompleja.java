package ec.edu.espol.FactoryMethod;

import java.time.LocalDateTime;

public class TareaCompleja implements Tarea{
    private String titulo;
    private String descripcion;
    private int prioridad;
    private LocalDateTime fechaVen;
    private int estado;
    private String requisitos;
    
    public TareaCompleja(String titulo, String descripcion, int prioridad, LocalDateTime fechaVen, int estado,
            String requisitos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVen = fechaVen;
        this.estado = estado;
        this.requisitos = requisitos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDateTime getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(LocalDateTime fechaVen) {
        this.fechaVen = fechaVen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public void completar(){
        
    }
}
