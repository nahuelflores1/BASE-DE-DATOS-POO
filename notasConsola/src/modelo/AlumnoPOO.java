
package modelo;

import java.util.ArrayList;

public class AlumnoPOO {
    private int Dni;
    private Nombre Nombre; 
    private String Correo;
    private ArrayList<Nota> listaNotas = new ArrayList<Nota>();

    public AlumnoPOO(int dni, Nombre nombre, String correo) {
        this.Dni = dni;
        this.Nombre = nombre;
        this.Correo = correo;
    }
    
    public double calcularPromedio(){
        return 0;
    }

    @Override
    public String toString() {
        return "AlumnoPOO{" + "dni=" + Dni + ", nombre=" + Nombre + ", correo=" + Correo + ", listaNotas=" + listaNotas + '}';
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public Nombre getNombre() {
        return Nombre;
    }

    public void setNombre(Nombre Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    
    
    
    
    
}
