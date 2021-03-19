package com.company;

public class LocalesComerciales extends Propiedad {
    private String fechaConstruc = "";
    private String fechaInspec = "";

    //Constructor
    public LocalesComerciales(String ultiDueño, String fechaAdquisicion, int numLote, int numRegistro, String fechaConstruc, String fechaInspec) {
        super(ultiDueño, fechaAdquisicion,numLote, numRegistro);
          this.fechaConstruc = fechaConstruc;
          this.fechaInspec = fechaInspec;
    }
    //GETTERS Y SETTERS

    public String getFechaConstruc() { return fechaConstruc; }
    public void setFechaConstruc(String fechaConstruc) { this.fechaConstruc = fechaConstruc; }

    public String getFechaInspec() { return fechaInspec; }
    public void setFechaInspec(String fechaInspec) { this.fechaInspec = fechaInspec; }

    //metodo
    public void mostrarDatos(){
        System.out.println("Ultimo dueño de la propiedad: "+ getUltiDueño() +
                "\nFecha de adquisicion de la propiedad: "+ getFechaAdquisicion()+
                "\nNumero de lote de la propiedad: "+getNumLote()+
                "\nNumero de registro de la propiedad: " + getNumRegistro()+
                "\nFecha de construccion del local comercial: "+ getFechaConstruc()+
                "\nFecha de inspeccion del local comercial: "+ getFechaInspec());
    }
}
