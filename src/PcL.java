import java.util.Scanner;

public class PcL {
    public static void main(String[] args) throws Exception {
       /* String nombre= "Andre";
        System.out.println("Hola " + nombre + " elije una opción: \n"+"1.Ir a clase \n"+"2.Ir a casa \n"+ "3.Ir al recreo");*/

        Scanner sc= new Scanner(System.in);
        System.out.print("Escribe un nombre: ");
        String nombre= sc.nextLine();
        System.out.print("Escribe la edad: ");
        String edad= sc.nextLine();
        System.out.println("Hola "+nombre+ " tu edad es: "+edad );
    }
}