/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Persona {
    private Integer id;
    private String TipoDni;
    private String apellido;
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private Rol id_rol;
    
    public String getTipoDni() {
        return TipoDni;
    }

    public void setTipoDni(String TipoDni) {
        this.TipoDni = TipoDni;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
    

     @Override
    public String toString() {
        return "Id_Persona: " + id + ", Tipo DNI: " + TipoDni + ", Numero DNI: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Direccion: " + direccion + ", Rol: " + id_rol +"\n";
    }
}
