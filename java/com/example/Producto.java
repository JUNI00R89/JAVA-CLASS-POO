package com.example;

public class Producto {

    double Precio;
    String nombreProducto;
    int idProducto;
    int Stock;

    public int getIdProducto() {
    return this.idProducto;
    }

    public int getStock() {
        return this.Stock;
    }

    public double getPrecio() {
        return this.Precio;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public void setidProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String toString() {
        return "  \n Productos " +
                " \n Precio =" + "  " + Precio +
                ", \n NombreProducto ='" + nombreProducto + '\'' +
                ", \n idProducto =" + idProducto +
                ", \n Stock =" + "  " + Stock;

    }

}
