/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Arreglos.Tabla;
import javax.swing.table.AbstractTableModel;
import Modelo.Persona;
/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaPersona extends AbstractTableModel {
    private Persona personas[];


    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    
   
    @Override
    public int getRowCount(){
        return personas.length;
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 6;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        Persona p=personas[i];
        switch(i1){
            case 0: return (p !=null) ? p.getTipoDni():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getDni():" ";
            case 2: return (p !=null) ? p.getId_rol().getNombre_rol():" ";
           case 3: return (p !=null) ? p.getNombre():" ";
            case 4: return (p !=null) ? p.getApellido():" ";
            case 5: return (p !=null) ? p.getDireccion():" ";
            default:
                return null;
        }
        
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Tipo identificacion";
            case 1:
                return "Numero identificacion";
            case 2:
                return "Tipo rol";
            case 3:
                return "Nombre";
            case 4:
                return "Apellido";
            case 5:
                return "Direccion";

                
            default:
                return null;

        }
    }
    
    
    
}
