import java.util.Scanner;


public class Ejercicios {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();
        //Ejercicio7();
        //Ejercicio8();
        //Ejercicio9();
        //Ejercicio10();
    }
    public static void Ejercicio1(){
        System.out.println("Buenos dias");
    }
    public static void Ejercicio2(){
        int l=5;
        l=l*l;
        System.out.println("Área de un cuadrado igual a 5: "+l);
    }
    public static void Ejercicio3(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce el lado de un cuadrado para calcular su área: ");
        int l=sc.nextInt();
        System.out.println("El área es: "+l*l);
    }
    public static void Ejercicio4(){
        int a= 5;
        int b= 8;
        int suma,resta,mult,div;
        suma = a+b;
        resta = a-b;
        mult = a*b;
        div = a/b;
        System.out.println("La s/r/m/d de "+a+" + "+b+" es: \n"+suma+"\n"+resta+"\n"+mult+"\n"+div);
    }
    public static void Ejercicio5(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce la longitud de un radio: ");
        int longitud=sc.nextInt();

    }
    public static void Ejercicio6(){
        Scanner sc=new Scanner(System.in);
        int precio;
        double descuento, preciofinal;
        System.out.print("Introduce precio: ");
        precio = sc.nextInt();
        System.out.print("Introduce descuento: ");
        descuento = sc.nextDouble();
        descuento= descuento/100;
        preciofinal=precio-(precio*descuento); 
        System.out.println(precio + " tiene un descuento de "+ descuento+"\n"+"el precio final es: "+ preciofinal);
    }

    public static void Ejercicio7(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Escribe una distancia en metros: ");
        int metros = sc.nextInt();
        int millas = metros*1852;
        System.out.println("Ahora lo convertiré a millas marinas: "+ millas);

    }
    public static void Ejercicio8(){
        System.out.print("Introduce tu edad: ");
            int edad= sc.nextInt();
        if(edad>18 ){
            System.out.println("Eres mayor de edad"); 
        }else if (edad<0 || edad>100) {
            System.out.println("Datos inválidos ");
        }else{
            System.out.println("No eres mayor de edad");
        }
    }
    public static void Ejercicio9(){
        // ya está hecho en el ejercicio 8
    }
    public static void Ejercicio10(){
        System.out.print("Escribe número 1: ");
        int num1=sc.nextInt();
        System.out.print("Escribe número 2: ");
        int num2= sc.nextInt();
        int suma, resta, mult, div;
        suma= num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div= num1/num2;
        if(num2==0){
            System.out.println("No es posible realizar esta división");
        }
        System.out.println("La suma es: "+suma+"\n"+"La resta es : "+resta+"\n"+"La multiplicación es: "+mult+"\n"+"La división es: "+div);
    }
    public static void Ejercicio11(){
        System.out.print("Escribe un número: ");
        int num1=sc.nextInt();
        System.out.print("Escribe otro número: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    public static void Ejercicio12(){
        System.out.print("Introduce un número: ");
        int numero= sc.nextInt();
        if(numero>=0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
    }
    public static void Ejercicio13(){
        System.out.print("Escribe un número: ");
        int num1=sc.nextInt();
        System.out.print("Escribe otro número: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num2+", "+num1);
        }else{
            System.out.println(num1+", "+num2);
        }
    }
    public static void Ejercicio14(){
        System.out.print("Escribe un número: ");
        int num1=sc.nextInt();
        System.out.print("Escribe otro número: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num2+", "+num1);
        }else if(num1==num2){
            System.out.println("Son iguales");
        }else{
            System.out.println(num1+", "+num2);
        }
    }
    public static void Ejercicio15(){
        System.out.print("Escribe un número: ");
        int num1=sc.nextInt();
        System.out.print("Escribe otro número: ");
        int num2=sc.nextInt();
        System.out.print("Escribe otro número: ");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3 ){
            System.out.println(num1);
        }else if(num2>num1 && num2>num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
    public static void Ejercicio16(){
        int nota;
        System.out.print("Ingrese una calificación: ");
        nota=sc.nextInt();
        if(nota>=0 || nota<3){
            System.out.println("Muy deficiente");
        }else if(nota>=3 || nota<5){
            System.out.println("Insuficiente");
        }else if (nota==5){
            System.out.println("Bien");
        }else if(nota>=6 || nota<9){
            System.out.println("Notable");
        }else if(nota>=9 ||nota<10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("introduce un número válido");
        }
    }
    public static void Ejercicio17(){
    //    int hora=60;
        int minutos =60;
        int segundos = 60;
      //  System.out.println(hora+":"+minutos+":"+segundos);
    }
    public static void Ejercicio18(){
        
    }
}
