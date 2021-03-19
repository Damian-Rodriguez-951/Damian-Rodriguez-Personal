package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println("Local #1:");
        LocalesComerciales mini1 = new LocalesComerciales("Maximo Segundo", "12/12/12",121,244,"12/12/12", "08/12/12");
        mini1.mostrarDatos();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Local #2: ");
        LocalesComerciales salonBelleza = new LocalesComerciales("Jose Moreno","12/05/2005",212,411,"12/09/2002","08/12/2011");
        salonBelleza.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Local #3: ");
        LocalesComerciales bar = new LocalesComerciales("Martin Hernandez","12/05/2015",2112,4131,"12/09/2012","08/12/2013");
        bar.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Departamento #1: ");
        Departamentos Condado = new Departamentos("Jose Antonio","12/05/2015",21142,41251,3,4,"Escuela,Hospital y Parque");
        Condado.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Departamento #2: ");
        Departamentos CocodelMar = new Departamentos("Damian Rodriguez","12/05/2001",252,4164,5,5,"Centro comercial, Aeropuerto y recreaciones nocturnas");
        CocodelMar.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Departamento #3: ");
        Departamentos LosAndes = new Departamentos("Edna Miiranda","01/08/2000",235242,425251,5,5,"Parques, salida al Corredor y Centros comerciales");
        LosAndes.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Terreno #1: ");
        Terrenos Chiriqui = new Terrenos("Daniel Quitero","12/05/2001",215672,44325, 31244.32,"Cerro Punta");
        Chiriqui.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Terreno #2: ");
        Terrenos santiago = new Terrenos("Roberto Romero","12/08/2011",27952,40175, 312441213.43,"Sona");
        santiago.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Terreno #3: ");
        Terrenos Santos = new Terrenos("Karina Carrion","12/08/2020",276202,400146, 2342350.41,"La Villa");
        Santos.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Terreno #4: ");
        Terrenos panama= new Terrenos("Arturo Miranda","01/02/2000",27634,426475, 31244121343.43,"Panama");
        panama.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Terreno #5: ");
        Terrenos Nobe = new Terrenos("Jose Maria Rodriguez","02/01/2001",22542,42663, 1455253.432,"San Felix ");
        Nobe.mostrarDatos();
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}
