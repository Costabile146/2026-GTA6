import java.util.Scanner;

public class Programacion2 {
    public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) throws Exception {
        boolean salir =false;
        while(!salir){
            System.out.print("Escribe A: ");
                int A=sc.nextInt();
            System.out.print("Escribe B: ");
                int B=sc.nextInt();
            System.out.print("Escribe C: ");
                int C=sc.nextInt();
                if(A*A+B*B==C*C){
                    System.out.println("Triángulo rectángulo");
                }else if(A==B || B==C || C==A){
                    System.out.println("Triángulo isósceles");
                }else if(A==B && B==C && C==A){
                    System.out.println("Triángulo equilátero");
                }else{
                    System.out.println("Escaleno");
                }
        }
    }
    }