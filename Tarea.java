

public class Tarea
{
    
    private String descripcion;
    
    private boolean tareaCompletada;
    
    public Tarea(String nuevaDescripcion)
    {
        descripcion = nuevaDescripcion;
        tareaCompletada = false;
    }
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public boolean getTareaCompletada()
    {
        boolean estaCompletada = false;
        if (tareaCompletada == true) {
            estaCompletada = true;
        }
        return tareaCompletada;
    }
    
    public void marcarTarea()
    {
        tareaCompletada = true;
    }

    
}
