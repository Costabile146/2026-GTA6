import java.util.Scanner;

public class BuclesII {
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
 }
  }      
}
public static void Ejercicio1(){
    for(int i=0;i<=20;i++){
        System.out.println(i);
    }
}
public static void Ejercicio2(){
    for(int i=0;i<=200;i=i+2){
        System.out.println(i);
    }
}
public static void Ejercicio3(){
    int par=0;
    for(int i=0;i<=200;i++){
        if(i%2==0){
            par++;
            System.out.println(par);
        }
    }
}
public static void Ejercicio4(){
    System.out.print("Introduce hasta que número contar:");
    int numero=sc.nextInt();
    for(int i=0;i<=numero;i++){
        System.out.println(i);
    }
}
public static void Ejercicio5(){
    System.out.print("Introduce un número para encontrar su factorial: ");
    int numero=sc.nextInt();
    int factorial=1;
    for(int i=1;i<=numero;i++){
        factorial=factorial*i;
    }
    System.out.println(factorial);
}
public static void Ejercicio6(){
    int numpos=0;
    int numneg=0;
    for(int i=0; i<10;i++){
            System.out.print("Introduce 10 números: ");
        int numero=sc.nextInt();
        if(numero<0){
            numneg++;
        }else{
            numpos++;
        }
    }
    System.out.println("Se leyeron : "+numneg+" números negativos");
}
public static void Ejercicio7(){
    int numpos=0;
    int numneg=0;
    for(int i=0; i<10;i++){
            System.out.print("Introduce 10 números: ");
        int numero=sc.nextInt();
        if(numero<0){
            numneg++;
        }else{
            numpos++;
        }
    }
    System.out.println("Se leyeron : "+numneg+" números negativos");
    System.out.println("Se leyeron : "+numpos+" números positivos");
}
public static void Ejercicio8(){
    int numpos=0;
    int numneg=0;
    boolean salir=false;
    while(!salir){
            System.out.print("Introduce números: ");
        int numero=sc.nextInt();
        if(numero<0){
            numneg++;
        }else if(numero>0){
            numpos++;
        }else{
            salir=true;
        
    }
    }
    System.out.println("Se leyeron : "+numneg+" números negativos");
    System.out.println("Se leyeron : "+numpos+" números positivos");
}
public static void Ejercicio9(){
    int suma=0;
    int producto=1;
    for(int i=0;i<10;i++){
        suma=+i;
        producto=producto*i;
        
    }
    System.out.println("");
}
public static void Ejercicio10(){
    int nota=0;
    boolean salir=false;
    while(!salir){
        System.out.print("Introduce números :");
        int numero=sc.nextInt();
        if(numero<0 || numero>10){
            System.out.println("Introduce un número válido");
        }
        if(numero==10){
            nota++;
        }
        if(numero==-1){
            System.out.println("Hubieron "+nota+"notas con valor 10");
            salir=true;

        }
    }
}
public static void Ejercicio11(){
    int par=0;
    int impar=0;
    for(int i=100;i<=200;i++){
        if(i%2==0){
            par=par+i;
        }else{
            impar=impar+i;
        }
    }
        System.out.println("Suma de pares: "+par);
        System.out.println("Suma de impares: "+impar);
}
public static void Ejercicio12(){
    System.out.print("Introduce valor A: ");
    int a=sc.nextInt();
    System.out.print("Introduce valor B: ");
    int b=sc.nextInt();
    int ve=a;
    for(int i=1;i<b;i++){
        ve*=a;
    }
    System.out.println("a^b : "+ve);
}
public static void Ejercicio13(){
    String h="mayor";
    String b="menor";
    String l="si";
    boolean salir=false;
    sc.nextLine();
    System.out.println("Intento adivinar tu número");
    while(!salir){
        int numerorandom = (int)(Math.random() * (100 - 1 + 1)) + 1;
        System.out.println("Tu número es "+numerorandom+" ?\n (Escribe mayor, menor o si)");
        String respuesta=sc.nextLine();
        if(respuesta.equals(h)){
            System.out.println("Tu número es mayor :c");
        }if(respuesta.equals(b)){
            System.out.println("Tu número es menor :c");
        }if(respuesta.equals(l)){
            System.out.println("ADIVINÉ TU NÚMERO");
            salir=true;
        }

    }
}
public static void Ejercicio14(){
    int cont500=0;
    int cont200=0;
    int cont100=0;
    int cont50=0;
    int cont20=0;
    int cont10=0;
    int cont5=0;
    System.out.println("Introduce la cantidad de euros a introducir (solo billetes): ");
    int billetes=sc.nextInt();
    int inicial=billetes;
    boolean salir=false;
    if(billetes%5==0){
    while(!salir){
        if(billetes>=500){
            billetes= billetes-500;
            cont500++;
        }else if(billetes>=200){
            billetes= billetes-200;
            cont200++;
        }else if(billetes>=100){
            billetes=billetes-100;
            cont100++;
        }else if(billetes>=50){
            billetes=billetes-50;
            cont50++;
        }else if(billetes>=20){
            billetes=billetes-20;
            cont20++;
        }else if(billetes>=10){
            billetes=billetes-10;
            cont10++;
        }else if(billetes>=5){
            billetes=billetes-5;
            cont5++;
        }else{
            System.out.println("Ya no hay billetes por contabilizar :) ");
            salir=true;
        }
    }
}
        System.out.println("Para "+inicial+" doy:"+cont500+"\n billetes de 500"+cont200+"\n billetes de 200"+cont100+"\n billetes de 100"+cont50+"\n billetes de 50"+cont20+"\n billetes de 20"+cont100+"\n billetes de 10"+cont5+"\n billetes de 5 ");
}
}
