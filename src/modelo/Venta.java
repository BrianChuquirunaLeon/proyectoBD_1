/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author BRIAN
 */
public class Venta {
    int id_venta;
    String nombreVendedor;
    String nombreCliente;
    String direccionCliente;
    GregorianCalendar fecha_venta = new GregorianCalendar();
    ArrayList nombreProducto = new ArrayList();
    ArrayList precio_venta = new ArrayList();
    ArrayList cantidad = new ArrayList();

    public Venta(int id_venta, String nombreVendedor, String nombreCliente, String direccionCliente) {
        this.id_venta = id_venta;
        this.nombreVendedor = nombreVendedor;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public GregorianCalendar getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(GregorianCalendar fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public ArrayList getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(ArrayList nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public ArrayList getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(ArrayList precio_venta) {
        this.precio_venta = precio_venta;
    }

    public ArrayList getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
