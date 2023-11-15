/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.TDA_Listas;
import Controlador.TDA_Listas.Excepciones.EstaVacia;

/**
 *
 * @author ALEJANDRO
 */

    public class ListaDinamica<E> {
    private Nodo<E> cabezera;
    private Nodo<E> ultimo;
    private Integer Longitud;

    public ListaDinamica() {
        cabezera = null; 
        ultimo = null; // no hay nodos lista
        Longitud = 0;
    }

    public Nodo<E> getCabezera() {
        return cabezera;
    }

    public Nodo<E> getUltimo() {
        return ultimo;
    }

    public Integer getLongitud() {
        return Longitud;
    }
    
    public Boolean EstaVacio(){
        return(cabezera == null || Longitud == 0 ); //true si esta vacia;false indicando elemento
    }
    
    private void AgregarCabeza(E info){ //agregamos un nuevo nodo al principio
        Nodo<E> Aux;
        if(EstaVacio()){
            Aux = new Nodo<>(info);
            cabezera = Aux;
            ultimo = Aux;
            Longitud++;
        }
        else{
            Nodo<E> CabezaAyuda = cabezera;
            Aux = new Nodo<>(info, CabezaAyuda);
            cabezera = Aux;
            Longitud++;
        }
    }
    
    private void AgregarFinal(E info){
        Nodo<E> Ayuda;
        if(EstaVacio()){
            AgregarCabeza(info);
        }
        else{
            Ayuda = new Nodo<>(info, null);
            ultimo.setSiguiente(Ayuda);
            ultimo = Ayuda;
            Longitud++;
        }
    }
    
    public void Agregar(E info){
        AgregarFinal(info);
    }
    
    private E ObtenerPrimero() throws EstaVacia{
        if(EstaVacio()){
            throw new EstaVacia("La lista esta vacia"); //lanzar excepcion
        }
        return cabezera.getInfo();
    }
    
    private E ObtenerUltimo() throws EstaVacia{
        if(EstaVacio()){
            throw new EstaVacia("La lista esta vacia");
        }
        return ultimo.getInfo();
    }
    
    public E ObtenerInfo(Integer indice)throws EstaVacia, IndexOutOfBoundsException{
        return ObtenerNodo(indice).getInfo();
    }
    
    private Nodo<E> ObtenerNodo(Integer indice)throws EstaVacia, IndexOutOfBoundsException{
        if(EstaVacio()){
            throw new EstaVacia("La lista esta vacia");
        }
        else if(indice.intValue() < 0 || indice.intValue() == Longitud){
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
        else if(indice.intValue() == 0){
            return cabezera;
        }
        else if(indice.intValue() == (Longitud -1)){
            return ultimo;
        }
        else{
            Nodo<E> Buscar = cabezera;
            int contador =0;
            while(contador < indice.intValue()){
                contador++;
                Buscar = Buscar.getSiguiente();
            }
            return Buscar;
        }
    }
    
    public void Agregar (E info, Integer indice)throws EstaVacia{
        if(EstaVacio() || indice.intValue() == 0){
            AgregarCabeza(info);//nuevo nodo principio lista
        }
        else if(indice.intValue() == Longitud){
            AgregarFinal(info);
        }
        else{
            Nodo<E> BuscarPrevio = ObtenerNodo(indice - 1);
            Nodo<E> Buscar= ObtenerNodo(indice);
            Nodo<E> Ayuda = new Nodo<>(info, Buscar);
            BuscarPrevio.setSiguiente(Ayuda);
            Longitud++;
        }
    }

    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder("Datos de lista \n");
        try {
            EstaVacio();
            
            Nodo<E> ayuda = cabezera;
            
            while(ayuda != null){
                SB.append(ayuda.getInfo()).append("\n");
                ayuda = ayuda.getSiguiente();
            }
        } 
        catch (Exception e) {
            SB.append(e.getMessage());
        }
        return SB.toString();
    }
}
