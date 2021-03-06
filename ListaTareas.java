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
    
    /**
     * Creo un metodo para marcar una tarea como completada.
     */
    public void marcarComoCompletada(int numeroTarea)
    {
        int tareaCompletada = numeroTarea - 1;
        if (numeroTarea <= listaDeTareas.size() && numeroTarea > 0) {
            listaDeTareas.get(tareaCompletada).marcarTarea();
        }
    }
    
    /**
     * Creo un metodo para buscar tareas introduciendo un texto coincidente.
     */
    public void buscarCoincidencias(String textoParaBuscar)
    {
        int contador = 1;
        String textoCoincidente = "";
        for (Tarea tareas : listaDeTareas) {
            if (tareas.getDescripcion().contains(textoParaBuscar)) {
                textoCoincidente = contador + ". " + tareas.getDescripcion();
                if (tareas.getTareaCompletada()) {
                    textoCoincidente = textoCoincidente + ". TERMINADA. " ;
                }
                System.out.println(textoCoincidente);
            }
            contador++;
        }
    }
    
    /**
     * Creo un metodo para eliminar una tarea.
     */
    public void eliminarTarea(int numeroTarea)
    {
        numeroTarea = numeroTarea - 1;
        if (numeroTarea < listaDeTareas.size() && numeroTarea >= 0) {
            listaDeTareas.remove(numeroTarea);
        }
    }
}
