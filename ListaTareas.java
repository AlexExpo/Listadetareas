import java.util.ArrayList;

public class ListaTareas
{
    
    private ArrayList<Tarea> listaDeTareas;

    
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
    }
    
    /**
     * Creo un método para agregar una tarea
     */
    public void agregarTarea(String nuevaTarea)
    {
        Tarea agregarLaTarea = new Tarea(nuevaTarea);
        listaDeTareas.add(agregarLaTarea);
    }
}
