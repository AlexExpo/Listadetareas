import java.util.ArrayList;

public class ListaTareas
{
    
    private ArrayList<Tarea> listaDeTareas;

    
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
    }
    
    /**
     * Creo un método para agregar una tarea.
     */
    public void agregarTarea(String nuevaTarea)
    {
        Tarea agregarLaTarea = new Tarea(nuevaTarea);
        listaDeTareas.add(agregarLaTarea);
    }
    
    /**
     * Creo un metodo para ver todas las tareas de la lista de tareas 
     * numeradas y pudiendo ver si estan completadas o no.
     */
    public void verTareas()
    {
        int contador = 1;
        String textoAMostrar = "";
        for (Tarea tareas : listaDeTareas) {
            textoAMostrar = contador + ". ";
            textoAMostrar = textoAMostrar + tareas.getDescripcion() + ".";
            if (tareas.getTareaCompletada() == true) {
                textoAMostrar = textoAMostrar + "TERMINADA. ";
            }
            System.out.println(textoAMostrar);
            contador++;
        }
    }
    
    public void marcarComoCompletada(int numeroTarea)
    {
        int tareaCompletada = numeroTarea - 1;
        if (numeroTarea <= listaDeTareas.size() && numeroTarea > 0) {
            Tarea tareas = listaDeTareas.get(tareaCompletada);
            tareas.set(tareaCompletada, true);
        }
    }
}
