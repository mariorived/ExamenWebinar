package clases;

import java.util.Objects;

public class Menu {
    private int numero;
    private float precio;
    private String nombre;
    private int calorias;
    private int disponibles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return getNumero() == menu.getNumero() && Float.compare(menu.getPrecio(), getPrecio()) == 0 && getCalorias() == menu.getCalorias() && Objects.equals(getNombre(), menu.getNombre()) && Objects.equals(getDisponibles(), menu.getDisponibles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero(), getPrecio(), getNombre(), getCalorias(), getDisponibles());
    }

    @Override
    public String toString() {
        return "Menu -> " +
                "numero=" + numero +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                ", disponibles=" + disponibles;
    }

    public Menu(int numero, float precio, String nombre, int calorias, int disponibles) {
        this.numero = numero;
        this.precio = precio;
        this.nombre = nombre;
        this.calorias = calorias;
        this.disponibles = disponibles;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }
}
