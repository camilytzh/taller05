package GestionTareas;

import CreadorTareas.Tarea;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Tarea> tareas;
    public TaskManager(){
        this.tareas = new ArrayList<>();
    }
    public void agregarTarea(){
        //logica
    }
    public void eliminarTarea(){
        //logica
    }
    public ArrayList<Tarea> obtenerListaTareas(){
        return tareas;
    }

}
