import java.util.Scanner;

public class Bateria_adicional {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean salir = true;
        while (salir) {
            System.out.print("Elige un ejercicio (1 - 10): ");
            int numero = sc.nextInt();
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
                default:
                    System.out.println("==============================");
                    System.out.println("Introduce un número válido 7-7");
                    System.out.println("==============================");
                    salir = false;
                    break;
            }
        }
    }

    public static void Ejercicio1() {
        System.out.print("Introduce lado a: ");
        int ladoa = sc.nextInt();
        System.out.print("Introduce lado b: ");
        int ladob = sc.nextInt();
        System.out.print("Introduce lado c: ");
        int ladoc = sc.nextInt();
        if (ladoa == ladob || ladob == ladoc || ladoc == ladoa) {
            System.out.println("Es un triángulo equilátero");
        }
        if (ladoa == ladob || ladoa != ladoc || ladob != ladoc) {
            System.out.println("Es un triángulo Isósceles");
        }
        if (ladoa != ladob || ladob != ladoc || ladoc != ladoa) {
            System.out.println("Es un triángulo Escaleno");
        }
    }

    public static void Ejercicio2() {
        System.out.print("Introdude un mes del año en números: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int año = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero \n tiene 31 días");
                break;
            case 2:
                if(año%4==0 || año%4==0){
                System.out.println("Es año biciesto \n Febrero tiene 29 días");
                }else{
                    System.out.println("Febrero tiene 28 días");
                }
                break;
            case 3:
                System.out.println("Marzo \n tiene 31 días");
                break;
            case 4:
                System.out.println("Abril \n tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo \n tiene 31 días");
                break;
            case 6:
                System.out.println("Junio \n tiene 30 días");
                break;
            case 7:
                System.out.println("Julio \n tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto \n tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre \n tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre \n tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre \n tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre \n tiene 31 días");
                break;
            default:
                System.out.println("Introduce un valor correcto");
                break;
        }

    }

    public static void Ejercicio3() {
    /*Escribe un programa que pida un día, un mes y un año, y determine si corresponden a una fecha válida en el calendario.
    Ten en cuenta los límites de días según el mes y si el año es bisiesto.*/
    System.out.print("Día: ");
        int dia=sc.nextInt();
    System.out.print("Mes: ");
        int mes=sc.nextInt();
    System.out.print("Año: ");
        int año=sc.nextInt();
    if(dia>31||dia<1){
        System.out.println("Introduce días válidos ");
    }if(mes>12||mes<1){
        System.out.println("Introduce mes válido");
    }if(año%4==0 || año%4==0){
        mes=2;
        
        System.out.println("Es año biciesto \n La fecha del calendario es válida \n "+dia+":"+mes+":"+año);
    }else{
        System.out.println("No es año biciesto \n La fecha del calendario es válida \n "+dia+":"+mes+":"+año);
    }
    }

    public static void Ejercicio4() {
        /* Un parking cobra las tarifas según los minutos estacionados:
            Los primeros 30 minutos son gratuitos.
            De 31 a 120 minutos: 0,05 €/minuto.
            De 121 a 360 minutos: 0,03 €/minuto.
            Más de 360 minutos: Tarifa fija diaria de 18 €.
            Escribe un programa que lea los minutos y calcule el importe total a pagar. */
            System.out.print("Cuántos minutos estacionados: ");
            int minutos=sc.nextInt();
            if(minutos<=30){
                System.out.println("No pagas nada :D ");
            }else if(minutos>30){
                double pago=(minutos-30)*0.05;
                System.out.println("Tienes que pagar: "+pago);
            }else if(minutos>120){
                double pago2=(minutos-120)*0.03;
            }else if(minutos>360){
                System.out.println("Tienes una tarifa estática de 18$");
            }
    }

    public static void Ejercicio5() {
        /*Solicita las coordenadas $(X, Y)$ de un punto en el plano cartesiano.
         El programa debe determinar si el punto está en el Origen $(0,0)$,
          sobre el Eje X, sobre el Eje Y, o en cuál de los cuatro cuadrantes se ubica (I, II, III o IV). */
          System.out.print("Ingrese Eje X: ");
          int x=sc.nextInt();
          System.out.print("Ingrese Eje Y: ");
          int y=sc.nextInt();
    }
    //FALTA POR REALIZAR
    public static void Ejercicio6() {
        /* Una tienda aplica descuentos acumulables en base a la categoría del cliente y la cantidad comprada:
            Categoría VIP: 15% de descuento base.
            Categoría Estándar: 5% de descuento base.
            Además, si el importe bruto supera los 200 €, se suma un 5% adicional de descuento a cualquier categoría.
            Dado el importe y la categoría, calcula el descuento total aplicado y el precio final. */
            String categoria1="VIP";
            String categoria2="Estandar";
            System.out.print("Importe a pagar: ");
            double importe=sc.nextDouble();
            sc.nextLine();
            System.out.print("Qué categoría tiene? ");
            String categoria=sc.nextLine();
            double descuento=0;
            if(categoria.equals(categoria1)){
                descuento=0.15;
                System.out.println("Categoría Vip");
            }else if(categoria.equals(categoria2)){
                descuento =0.05;
                System.out.println("Categoría Estándar");
            }else{
                System.out.println("Introduzca un nombre válido");
            }

            if(importe>200){
                descuento+=0.05;
            }
            double totaldescuento=importe*descuento;
            double preciofinal=importe-totaldescuento;
            System.out.println("Total a pagar: "+preciofinal);
    }

    public static void Ejercicio7() {
        /*Crea un programa que simule una ronda de Piedra, Papel o Tijera entre dos jugadores.
         Lee la elección del Jugador 1 y del Jugador 2 (como texto o como número: 1=Piedra, 2=Papel, 3=Tijera)
          y determina quién gana o si hay empate. */
        System.out.println("Bienvenido al piedra papel o tijera");
        System.out.println("====================================");
        boolean salir=true;
        while(salir){
        System.out.println("Opciones: 1=Piedra, 2=Papel, 3=Tijera");
        System.out.println("Jugador 1:");
        int jugador1=sc.nextInt();
        System.out.println("Jugador 2:");
        int jugador2=sc.nextInt();
        if(jugador1==jugador2){
            System.out.println("Es un empate");
        }else if((jugador1==1 && jugador2==3)||
                  (jugador1==2 && jugador2==1)||
                  (jugador1==3 && jugador2==2)){
                    System.out.println("Jugador 1 GANA");
                    salir=false;
        }else{
            System.out.println("Jugador 2 GANA");
            salir=false;
        }
        }

    }

    public static void Ejercicio8() {
        /*Escribe un programa que lea tres números enteros cualesquiera (pueden ser iguales)
         y los muestre ordenados de menor a mayor utilizando únicamente estructuras condicionales 
         (sin usar funciones de ordenación del lenguaje). */
         System.out.println("Ordenamiento de números:");
         System.out.print("Introduce número 1: ");
         int num1=sc.nextInt();
         System.out.print("Introduce número 2: ");
         int num2=sc.nextInt();
         System.out.print("Introduce número 3: ");
         int num3=sc.nextInt();
         if((num1>num2&&num1>num3)&&(num2>num3)){
            System.out.println(num3+""+num2+""+num1);
         //}if((num2>num1&&num2>num3)&&(num)){

         }
    }

    public static void Ejercicio9() {

    }

    public static void Ejercicio10() {

    }
}