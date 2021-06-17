package clases;

import java.util.Objects;

public class Usuario {
    private int edad;
    private String nombre;
    private String apellido;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getEdad() == usuario.getEdad() && Float.compare(Usuario.getNombre()) && Objects.equals(getApellido(), usuario.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), getNombre(), getApellido());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    @Override
    public String toString() {
            return "Usuario -> " +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido=" + apellido;

    }

    public Usuario(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}