/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Rol;

/**
 *
 * @author ALEJANDRO
 */
public class RolControl {
    private Rol[] roles;
    
    public RolControl(){
        roles=new Rol[3];
        roles[0]= new Rol(1, "Administrador","Es un admin");
         roles[1]= new Rol(2, "Cajero","Es un admin");
          roles[2]= new Rol(3, "Cliente","Es un admin");
    }

    public Rol[] getRoles() {
        return roles;
    }
    
    public void setRoles(Rol[] roles) {
        this.roles=roles;
    }
    
    
}
