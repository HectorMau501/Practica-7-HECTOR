
package Clases;


public class PilaLibro 
{
     //Apuntador principal de la estructura
   public Libro pilaLibro;

    public PilaLibro() 
    {
        pilaLibro = null;
    }
   
    //Operacion para agregar al inicio de la pila un nodo
    public void pushLibro(String nombre, String seccion,  int paginas, float tamaño)
    {
        //Crear el nuevo nodo con el valor
        Libro nuevo = new Libro(nombre,seccion,paginas,tamaño);
        
        if(pilaLibro == null)
        {
            //Se agrega el primer nodo a la pila
            pilaLibro = nuevo;
        }
        else
        {
            Libro aux = pilaLibro;
            pilaLibro = nuevo;
            nuevo.setAptSiguiente(aux);
        } 
    }
    
    public String  recorrerPilaLibro()
    {
        Libro aux = pilaLibro;
        String valor= "Libro:\n";
        
        if(pilaLibro == null)
        {
            valor = "\nLa pila esta vacia";
        }
        else
        {
            while(aux != null)
            {
                valor += ("Nombre: "+aux.getNombre()+"\n");
                valor += ("Seccion:"+aux.getSeccion()+"\n");
                valor += ("Paginas: "+aux.getPaginas()+"\n");
                valor += ("Tamaño:"+aux.getTamaño()+"\n");
                
                aux = aux.getAptSiguiente();
            }
        }
        return valor;
    }
    
    
    public void popLibro()
    {
        Libro aux = pilaLibro;
        
        if(pilaLibro == null)
        {
            System.out.println("Pila esta vacia");
        }
        else
        {
            if(aux.getAptSiguiente() == null)
            {
                pilaLibro = null;
            }
            else
            {
                pilaLibro = aux.getAptSiguiente();
            }
            
            System.out.println("Primer elemento eliminado");
        }
        
    }
    
}
