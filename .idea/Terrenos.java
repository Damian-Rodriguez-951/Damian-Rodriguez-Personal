package com.company;

public class Terrenos extends Propiedad{
    private double metCuadra = 0.00F;
    private String ubicacion = "";
    public Terrenos(String ultiDueño, String fechaAdquisicion, int numLote, int numRegistro, double metCuadra, String ubicacion){
      super(ultiDueño, fechaAdquisicion, numLote, numRegistro);
      this.metCuadra = metCuadra;
      this.ubicacion = ubicacion;
    }
    //GETTERS Y SETTERS

    public float getMetCuadra() { return (float) metCuadra; }
    public void setMetCuadra(double metCuadra) { this.metCuadra = metCuadra; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    //Metodo
    public void mostrarDatos(){
        System.out.println("Ultimo dueño de la propiedad: "+ getUltiDueño() +
                "\nFecha de adquisicion de la propiedad: "+ getFechaAdquisicion()+
                "\nNumero de lote de la propiedad: "+getNumLote()+
                "\nNumero de registro de la propiedad: " + getNumRegistro()+
                "\nArea del terreno: "+ getMetCuadra()+ " metros cuandrados"+
                "\nUbicacion del terreno: "+ getUbicacion());
    }
}
