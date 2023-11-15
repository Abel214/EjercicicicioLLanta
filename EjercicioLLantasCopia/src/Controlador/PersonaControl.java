/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;

/**
 *
 * @author ALEJANDRO
 */
public class PersonaControl {
    //metodo que permite guardar
    private Persona persona;
    private Persona [] personas;
    
    
    public Persona getPersona() {
        if(persona==null){
            persona=new Persona();
        }
            
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    
    public PersonaControl(Integer tamanio){
        this.personas=new Persona[tamanio];
    }
    //Mwtodo guardar
    public Boolean guardar(){
        Integer pos=posVerificar();
        if(pos>-1){
            persona.setId(pos+1);
            personas[posVerificar()]=persona;
            return true;
        } 
        else{
        return false;
        }
    }
    
    public Integer posVerificar(){
        Integer band= -1;
         for(int i=0;i< this.personas.length;i++){
            if(this.personas[i]==null){   
                band=i;
                break;
            }
        }
         return band;
    }
    
    public void imprimir(){
        for(int i=0;i< this.personas.length;i++){
            System.out.println(getPersonas()[i]);
        }  
    }
}
