/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Arreglos.Util;

import Modelo.Rol;
import javax.swing.JComboBox;
import Controlador.RolControl;
/**
 *
 * @author ALEJANDRO
 */
public class UtilVista {
    public static void CargarComboRoles(JComboBox cbx){
        RolControl rolControlador = new RolControl();
        cbx.removeAllItems();
        for(int i = 0; i < rolControlador.getRoles().length; i++){
            cbx.addItem(rolControlador.getRoles()[i]);
        }
    }
    
    public static Rol ObtenerRolControlador(JComboBox cbx){
        return (Rol)cbx.getSelectedItem();
    }
}
