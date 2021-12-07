package com.example.anti_acoso;

public class ClaseAmigos
{
    private String rut;
    private String nombre;
    private String apellido;
    private String genero;

    public ClaseAmigos(String rut, String nombre, String apellido, String genero) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
