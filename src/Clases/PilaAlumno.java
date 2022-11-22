
package Clases;


public class PilaAlumno 
{
    //Apuntador principal de la estructura
    Alumno pilaAlumno;

    public PilaAlumno() 
    {
        pilaAlumno = null;
    }
   
    //Operacion para agregar al inicio de la pila un nodo
    public void push(String nombre, int codigo,  String direccion, int telefono)
    {
        //Crear el nuevo nodo con el valor
        Alumno nuevo = new Alumno(nombre,codigo,direccion,telefono);
        
        if(pilaAlumno == null)
        {
            //Se agrega el primer nodo a la pila
            pilaAlumno = nuevo;
        }
        else
        {
            Alumno aux = pilaAlumno;
            pilaAlumno = nuevo;
            nuevo.setAptSiguiente(aux);
        } 
    }
    
    public String  recorrerPila()
    {
        Alumno aux = pilaAlumno;
        String valor= "Alumnos:\n";
        
        if(pilaAlumno == null)
        {
            System.out.println("La pila esta vacia");;
        }
        else
        {
            while(aux != null)
            {
                valor += ("Nombre: "+aux.getNombre()+"\n");
                valor += ("Codigo:"+aux.getCodigo()+"\n");
                valor += ("Direccion: "+aux.getDireccion()+"\n");
                valor += ("Telefono:"+aux.getTelefono()+"\n");
                
                aux = aux.getAptSiguiente();
            }
        }
        return valor;
    }
    
    
    public void pop()
    {
        Alumno aux = pilaAlumno;
        
        if(pilaAlumno == null)
        {
            System.out.println("Pila esta vacia");
        }
        else
        {
            if(aux.getAptSiguiente() == null)
            {
                pilaAlumno = null;
            }
            else
            {
                pilaAlumno = aux.getAptSiguiente();
            }
            
            System.out.println("Primer elemento eliminado");
        }
        
    }
   
    
}
