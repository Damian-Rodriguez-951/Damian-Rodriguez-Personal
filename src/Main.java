import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declaramos variables;
        float nuevo, suma = 0, prom = 0;
        System.out.println("PORGRAMA PARA SACAR PROMEDIOS");
        Scanner n = new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE NOTAS: ");
        int notas = n.nextInt();
        for (int i = 1; i <= notas; i++) {
            Scanner o = new Scanner(System.in);
            System.out.println("INGRESE LA NOTA OBTENIDA" + "{"+i+"}:");
            nuevo = o.nextFloat();
            suma= suma + nuevo;
             prom = suma/notas;
        }
        System.out.println("El promedio es: " + prom);
    }
}

