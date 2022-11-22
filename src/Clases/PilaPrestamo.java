/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HECTOR MAURICIO
 */
public class PilaPrestamo
{
    public Prestamo pilaPrestamo;

    public PilaPrestamo() 
    {
        pilaPrestamo = null;
    }
    
    public void pushPrestamo(int diasPrestado, int cantidad, String fechaRealizado, String fechaDevuelto)
    {
        Prestamo nuevo = new Prestamo(diasPrestado, cantidad, fechaRealizado, fechaDevuelto); 
        
        if(pilaPrestamo == null)
        {
            pilaPrestamo = nuevo;
        }
        else
        {
            Prestamo aux = pilaPrestamo;
            pilaPrestamo = nuevo;
            nuevo.setAptSiguiente(aux);
        }       
    }
    
    public String recorrerPrestamo()
    {
        Prestamo aux = pilaPrestamo;
        String valor = "Prestamo:\n";
        
        if(pilaPrestamo == null)
        {
            valor = "La pila esta vacia.";
        }
        else
        {
            while(aux != null)
            {
                valor += ("Dias de prestamo:"+aux.getDiasPrestado()+"\n");
                valor += ("Cantidad de libros:"+aux.getCantidad()+"\n");
                valor += ("Fecha del prestamo:"+aux.getFechaRealizado()+"\n");
                valor += ("Fecha devuelto:"+aux.getFechaDevuelto()+"\n");
                aux = aux.getAptSiguiente();
            }
        }
        
        return valor;
    }
    
    public void pop()
    {
       Prestamo aux = pilaPrestamo;
       
       if(pilaPrestamo == null)
       {
           System.out.println("La pila esta vacia");
       }
       else
       {
           if(aux.getAptSiguiente() == null)
           {
               pilaPrestamo = null;
           }
           else
           {
               aux.getAptSiguiente();
           }
           
           System.out.println("Primer elemento eliminado");
       }
         
    }
    
    
    
}
