import java.util.Scanner;

public class Programacion3 {
    public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) throws Exception {
    int multiplicador=0;
    int correcto=0;
    int incorrecto=0;
    int respuestareal;
    System.out.print("Escribe un número: ");
        int numero=sc.nextInt();
        for(int i=0;i<11;i++){
            System.out.println("Cuánto es "+numero+"*"+multiplicador+"?");
            int respuesta=sc.nextInt();
            respuestareal=numero*multiplicador;
            if(respuesta==respuestareal){
                System.out.println("Es correcto");
                correcto++;
            }else{
                System.out.println("Es incorrecto");
                incorrecto++;
            }
            multiplicador++;
        }
        System.out.println("Tienes: "+correcto+" correctas");
        System.out.println("Tienes: "+incorrecto+" incorrectas");
    }
    }