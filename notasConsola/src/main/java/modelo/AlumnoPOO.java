
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

    
    
    
}
