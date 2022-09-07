package modelo;

import java.time.LocalDate;

public class Nota {
    double Numero;
    int Dni;
    String Tipo;
    int NroBim;
    LocalDate Fecha;

    public double getNumero() {
        return Numero;
    }

    public void setNumero(double Numero) {
        this.Numero = Numero;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNroBim() {
        return NroBim;
    }

    public void setNroBim(int NroBim) {
        this.NroBim = NroBim;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    
}

