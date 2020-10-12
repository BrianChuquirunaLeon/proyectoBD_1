/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author BRIAN
 */
public class Cliente {
    int id_cliente;
    String nombre;
    String apellido_pat;
    String apellido_mat;
    String dni;
    String cel_uno;
    String cel_dos;
     
    
    Cliente(int id_cliente,String nombre,String apellido_pat,String apellido_mat){
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCel_uno() {
        return cel_uno;
    }

    public void setCel_uno(String cel_uno) {
        this.cel_uno = cel_uno;
    }

    public String getCel_dos() {
        return cel_dos;
    }

    public void setCel_dos(String cel_dos) {
        this.cel_dos = cel_dos;
    }
    
}
