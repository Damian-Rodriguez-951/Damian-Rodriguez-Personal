package com.company;

public class Departamentos extends Propiedad{
    private int numHabi = 0;
    private int numBaños = 0;
    private String aminidad = "";
    public Departamentos(String ultiDueño, String fechaAdquisicion, int numLote, int numRegistro,int numHabi, int numBaños, String aminidad){
        super(ultiDueño, fechaAdquisicion, numLote, numRegistro);
        this.numHabi = numHabi;
        this.numBaños = numBaños;
        this.aminidad = aminidad;
    }
    //GETTERS AND SETTERS

    public int getNumHabi() { return numHabi; }
    public void setNumHabi(int numHabi) { this.numHabi = numHabi; }

    public int getNumBaños() { return numBaños; }
    public void setNumBaños(int numBaños) { this.numBaños = numBaños; }

    public String getAminidad() { return aminidad; }
    public void setAminidad(String aminidad) { this.aminidad = aminidad; }

    //METODOS
    public void mostrarDatos(){
        System.out.println("Ultimo dueño de la propiedad: "+ getUltiDueño() +
                "\nFecha de adquisicion de la propiedad: "+ getFechaAdquisicion()+
                "\nNumero de lote de la propiedad: "+getNumLote()+
                "\nNumero de registro de la propiedad: " + getNumRegistro()+
                "\nCantidad de habitaciones del departamento: "+ getNumHabi()+ " habitaciones"+
                "\nCanidad de baños del departamento: "+ getNumBaños() + " baños"+
                "\nAminidades del departamento: " + getAminidad());
    }
}
