import java.util.Scanner;

public class Programacion1 {
    public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) throws Exception {
    boolean salir =false;
    while(!salir){
        System.out.print("Elige un día de la semana: ");
        int numero=sc.nextInt();
        if(numero==7){
            System.out.println("Domingo");
        }
        else if(numero==6){
            System.out.println("Sábado");
        }
        else if(numero==5){
            System.out.println("Viernes");
        }
        else if(numero==4){
            System.out.println("Jueves");
        }
        else if(numero==3){
            System.out.println("Miércoles");
        }
        else if(numero==2){
            System.out.println("Martes");
        }
        else if(numero==1){
            System.out.println("Lunes");
        }else if(numero==0){
            System.out.println("AdióFFFFF"); 
            salir=true;   
        }else{
            System.out.println("Escribe un número válido");
        }
    }
    }
    }
    
       