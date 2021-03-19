package com.company;

public class Propiedad {
    //atributos
    private String fechaAdquisicion = "";
    private String ultiDueño = "";
    private int numLote= 0;
    private int numRegistro = 0;

    //Constructor
    public Propiedad(String ultiDueño,String fechaAdquisicion, int numLote, int numRegistro) {
        this.ultiDueño = ultiDueño;
        this.fechaAdquisicion = fechaAdquisicion;
        this.numLote = numLote;
        this.numRegistro = numRegistro;
    }
    //GETTERS Y SETTERS
    public void setFechaAdquisicion(String fechaAdqusicion) { this.fechaAdquisicion = fechaAdquisicion; }
    public String getFechaAdquisicion() { return fechaAdquisicion; }

    public int getNumLote() { return numLote; }
    public void setNumLote(int numLote) { this.numLote = numLote; }

    public String getUltiDueño() { return ultiDueño;}
    public void setUltiDueño(String ultiDueño) { this.ultiDueño = ultiDueño; }

    public int getNumRegistro() { return numRegistro; }
    public void setNumRegistro(int numRegistro) { this.numRegistro = numRegistro; }
}
