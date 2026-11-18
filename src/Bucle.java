import java.util.Scanner;

//Math.random() * (max - min) + min;
//int randomInt = (int)(Math.random() * (max - min + 1)) + min;
public class Bucle {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean salir = true;
        while(salir){
            System.out.print("Elige un ejercicio (1 - 18): ");
            int numero=sc.nextInt();
            switch (numero) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
                case 7:
                    Ejercicio7();
                    break;
                case 8:
                    Ejercicio8();
                    break;
                case 9:
                    Ejercicio9();
                    break;
                case 10:
                    Ejercicio10();
                    break;
                case 11:
                    Ejercicio11();
                    break;
                case 12:
                    Ejercicio12();
                    break;
                case 13:
                    Ejercicio13();
                    break;
                case 14:
                    Ejercicio14();
                    break; 
                case 15:
                    Ejercicio15();
                    break; 
                case 16:
                    Ejercicio16();
                    break;
                case 17:
                    Ejercicio17();
                    break;
                case 18:
                    Ejercicio18();
                    break;           
                default:
                    System.out.println("==============================");
                    System.out.println("Introduce un número válido 7-7");
                    System.out.println("==============================");
                    salir = false;
                    break;
            }
        }
}
public static void Ejercicio1(){
        sc.nextLine();
        System.out.println("Buenos dias");
    }
    public static void Ejercicio2(){
        sc.nextLine();
        int l=5;
        l=l*l;
        System.out.println("Área de un cuadrado igual a 5: "+l);
    }
    public static void Ejercicio3(){
        sc.nextLine();
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce el lado de un cuadrado para calcular su área: ");
        int l=sc.nextInt();
        System.out.println("El área es: "+l*l);
    }
    public static void Ejercicio4(){
        sc.nextLine();
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
        sc.nextLine();
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce la longitud de un radio: ");
        int longitud=sc.nextInt();

    }
    public static void Ejercicio6(){
        sc.nextLine();
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
        sc.nextLine();
        Scanner sc= new Scanner(System.in);
        System.out.print("Escribe una distancia en metros: ");
        int metros = sc.nextInt();
        int millas = metros*1852;
        System.out.println("Ahora lo convertiré a millas marinas: "+ millas);

    }
    public static void Ejercicio8(){
        sc.nextLine();
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
        sc.nextLine();
        // ya está hecho en el ejercicio 8
    }
    public static void Ejercicio10(){
        sc.nextLine();
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
        sc.nextLine();
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
        sc.nextLine();
        System.out.print("Introduce un número: ");
        int numero= sc.nextInt();
        if(numero>=0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
    }
    public static void Ejercicio13(){
        sc.nextLine();
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
        sc.nextLine();
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
        sc.nextLine();
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
        sc.nextLine();
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
        sc.nextLine();
        int hora;
        int minutos;
        int segundos;
        System.out.print("Escribe una hora: ");
        hora=sc.nextInt();
        System.out.print("Escribe los minutos: ");
        minutos=sc.nextInt();
        System.out.print("Escribe los segundos: ");
        segundos=sc.nextInt();
        segundos ++;
        if(segundos==60 || segundos<60){
            minutos++;
            segundos=0;
        }if(minutos==60 || minutos<60){
            hora++;
            minutos=0;
        }
        if(hora>24 || hora<1 ){
            System.out.println("Err0R d3 H0r4 \n vuelva a introducir valores");
        }
        System.out.println(hora+":"+minutos+":"+segundos);
    }
    public static void Ejercicio18(){
        System.out.println("Salario neto semanal de un trabajador");
        System.out.print("Introduce el número de horas realizadas: ");
         int horas=sc.nextInt();
         if(horas<=35){
         }
    }
}

