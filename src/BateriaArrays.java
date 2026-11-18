import java.util.Scanner;
import java.util.Arrays;
public class BateriaArrays {
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
                case 19:
                    Ejercicio19();
                    break;
                case 20:
                    Ejercicio20();
                    break;
                }
        }
        }       
public static void Ejercicio1(){
                    System.out.println("Escribe 10 números:");
                    int[]numerow=new int[10];
                    for(int i=0;i<numerow.length;i++){
                        System.out.print("Número "+(i+1)+":");
                        numerow[i]=sc.nextInt();
                    }
                    System.out.println("Números guardados:");
                    for(int i=0; i<numerow.length;i++){
                        System.out.println(numerow[i]);
                    }
}
public static void Ejercicio2(){
                        double suma=0;
                    System.out.println("Escribe 10 números: ");
                    int[]numeroq=new int[10];
                    for(int i=0; i<numeroq.length;i++){
                        System.out.println("Número "+(i+1)+":");
                        numeroq[i]=sc.nextInt();
                    }
                    for(int i=0;i<numeroq.length;i++){
                        suma=suma+numeroq[i];
                    }
                    System.out.println("La suma de os números introducidos es: "+suma);
                    
}
public static void Ejercicio3(){
    int maximo=Integer.MAX_VALUE;
    int minimo=Integer.MIN_VALUE;
    System.out.println("Escribe 10 números: ");
                    int[] numeroe=new int[10];
                    for(int i=0;i<numeroe.length;i++){
                        System.out.println("Número "+(i+1)+":");
                        numeroe[i]=sc.nextInt();
                    }for(int i=0;i<numeroe.length;i++){
                        if(numeroe[i]<minimo){
                            minimo=numeroe[i];
                        }if(numeroe[i]>maximo){
                            maximo=numeroe[i];
        }
    }
    System.out.println("El máximo es: "+maximo);
    System.out.println("El mínimo es: "+minimo);
}
public static void Ejercicio4(){
    int sumapositivos=0;
    int sumanegativos=0;
    System.out.println("Escribe 20 números:");
    int[]numeror=new int[20];
    for(int i=0; i<numeror.length;i++){
        System.out.println("Número "+(i+1)+":");
        numeror[i]=sc.nextInt();
    }
    for(int i=0;i<numeror.length;i++){
        if(numeror[i]<0){
            sumanegativos+=numeror[i];
        }else{
            sumapositivos+=numeror[i];
        }
    }
    System.out.println("Los resultados fueron: ");
    System.out.println("Suma de positivos: "+sumapositivos+"\nSuma de negativos: "+sumanegativos);

}
public static void Ejercicio5(){
    int suma=0;
    System.out.println("Ingrese 20 números: ");
    int[]numerot=new int[20];
    for(int i=0;i<numerot.length;i++){
        System.out.println("Número "+(i+1)+":");
        numerot[i]=sc.nextInt();
    }
    for(int i=0; i<numerot.length;i++){
        suma+=numerot[i];
    }
    System.out.println("La media es: "+suma/numerot.length);
}
public static void Ejercicio6(){
    System.out.print("Ingrese valor N: ");
        int valorN=sc.nextInt();
    System.out.print("Ingrese valor M: ");
        int valorM=sc.nextInt();
    System.out.println("Se creó un array de "+valorN+" espacios");
        int[]numeroy=new int[valorN];
    for(int i=0;i<numeroy.length;i++){
        numeroy[i]=valorM;
    }
    for(int i=0;i<numeroy.length;i++){
        System.out.println("Posición "+(i+1)+": "+ numeroy[i]);
    }
}
public static void Ejercicio7(){
    System.out.print("Ingrese valor P:");
        int valorP=sc.nextInt();
    System.out.print("Ingrese valor Q:");
        int valorQ=sc.nextInt();
        int tamaño=(valorQ-valorP)+1;
        int []array=new int[tamaño];
        for(int i=0;i<array.length;i++){
            array[i]=valorP;
            valorP++;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
}
public static void Ejercicio8(){
    //Math.random() * (max - min) + min;
    int suma=0;
    double [] numerou=new double[100];
    for(int i=0; i<numerou.length;i++){
        numerou[i]=Math.random()*(0.0-1.0)+0.0;
    }
    System.out.print("Introduce valor R: ");
        double valorR=sc.nextDouble();
    for(int i=0;i<numerou.length;i++){
        if(numerou[i]<=valorR){
            System.out.print(numerou[i]+",");
            suma++;
        }
    }
    System.out.println("En total hay "+suma+" valores iguales o superiores a R");
}
public static void Ejercicio9(){
    int suma=0;
    //int randomInt = (int)(Math.random() * (max - min + 1)) + min;
    int[] numeroi=new int [100];
    for(int i=0;i<numeroi.length;i++){
        numeroi[i]=(int)(Math.random()*(10-1+1))+1;
    }
    System.out.print("Escribe un valor N: ");
        int valorN=sc.nextInt();
        for(int i=0;i<numeroi.length;i++){
            if(numeroi[i]==valorN){
                System.out.println("En la posición "+(i+1)+":"+numeroi[i]);
                suma++;
            }
        }
}
public static void Ejercicio10(){
    System.out.print("Cuantos datos introducirás?");
    int tamaño=sc.nextInt();
    double [] alturas=new double[tamaño];
    for(int i=0;i<alturas.length;i++){
        System.out.print("Intrduce la altura "+(i+1)+":");
        alturas[i]=sc.nextDouble();
    }
    double maxima=alturas[0];
    double minima=alturas[0];;
    double media=0;
    for(int i=0;i<alturas.length;i++){
        if(alturas[i]>maxima){
            maxima=alturas[i];
        }
        if(alturas[i]<minima){
            minima=alturas[i];
        }
        media+=alturas[i];
    }
    System.out.println("La altura media es: "+media/2);
    System.out.println("La altura máxima es: "+maxima);
    System.out.println("La altura mínima es: "+minima);
}
public static void Ejercicio11(){
    int valorI=1;
    int valorF=100;
    int []array1=new int [100];
    int []array2=new int [100];
    for(int i=0;i<array1.length;i++){
        array1[i]=valorI;
        valorI++;
    }for(int i=0;i<array1.length;i++){
        System.out.print(array1[i]+",");
    }
    for(int i=0;i<array2.length;i++){
        array2[i]=valorF;
        valorF--;
    }
    System.out.println(" ");
    System.out.println("Inverso");
    for(int i=0;i<array2.length;i++){
        System.out.print(array2[i]+",");
    }
    System.out.println("");
}
public static void Ejercicio12(){
    int []numeroo=new int[10];
    
}
public static void Ejercicio13(){
    System.out.print("Introduce V: ");
    int v=sc.nextInt();
    System.out.print("Ingresa I: ");
    int I=sc.nextInt();
    System.out.println("Cuántos valores se creará?");
    int valor=sc.nextInt();
    int[] numerop=new int[valor];

    for(int i=0;i<numerop.length;i++){
        numerop[i]=v;
        System.out.print(numerop[i]+",");
        v+=I;
        
    }
    System.out.println("");
}
public static void Ejercicio14(){
    int[] numeroa=new int[55];
    int posicion=0;
    int numero=1;
    for(int i=1;i<=10;i++){
        for(int j=0; j<i;j++){
            numeroa[posicion]=numero;
            posicion++;
        }
        numero++;
    }
    for(int i=0;i<numeroa.length;i++){
        System.out.println(numeroa[i]+",");
    }
}
public static void Ejercicio15(){
    System.out.print("Valor M: ");
        int M=sc.nextInt();
    System.out.print("Valor N: ");
        int N=sc.nextInt();
    int[]numerod=new int[N];
    for(int i=0;i<numerod.length;i++){
        numerod[i]=M;
    }
    for(int i=0;i<numerod.length;i++){
        System.out.print(numerod[i]+",");
    } 
    System.out.println("");
}
public static void Ejercicio16(){
   /* int[]numeroa=new int[55];
    int pos
    /*    Arrays.fill(numeroa,1);
        Arrays.fill(numeroa,1,3,2);
        Arrays.fill(numeroa,3,6,3);
        //bla blabla
    for(int i=0;i<numeroa.length;i++){
        System.out.println(numeroa[i]);
    }
   for(int i=10;i<10;i++){
    inicio =fin;
    fin =inicio+i;
    Array.fill(numeroa,inicio,fin,i);
   }*/
}
public static void Ejercicio17(){
    int[]numeros=new int[10];
    int[]numerod=new int[10];
    System.out.print("Introduce 20 numeros: ");
    for(int i=0;i<20;i++){
        System.out.print((i+1)+": ");
        int numero=sc.nextInt();
            if (i<10) {
                numeros[i]=numero;
            }else{
                numerod[i-10]=numero;
            }
        }
    for(int i=0;i<numeros.length;i++){
    System.out.print(numeros[i]+", ");
    }
    System.out.println("");
    for(int i=0;i<numerod.length;i++){
    System.out.print(numeros[i]+", ");
    }
    System.out.println("");
}

public static void Ejercicio18(){
    //int randomInt = (int)(Math.random() * (max - min + 1)) + min;
    int []numerof=new int[30];
    for(int i=0;i<numerof.length;i++){
        numerof[i]=(int)(Math.random()*(10-0+1))+0;
    }
    for(int i=0;i<numerof.length;i++){
        System.out.print(numerof[i]+", ");
    }
    System.out.println(" ");
    System.out.println("Ordenados:");
    Arrays.sort(numerof);
    for(int i=0;i<numerof.length;i++){
        System.out.print(numerof[i]+", ");
    }
}
public static void Ejercicio19(){
    //ARRAYS LEIDOS AL REVÉS
    //ARRAYS LEIDOS AL REVÉS
    //ARRAYS LEIDOS AL REVÉS
    //ARRAYS LEIDOS AL REVÉS
    //ARRAYS LEIDOS AL REVÉS

    int []numerog= new int[8];
    System.out.println("Ranking de Puntuaciones ");
    System.out.println("========================");
    System.out.print("Ingrese la puntuación: ");
    for(int i=0;i<numerog.length;i++){
        System.out.print((i+1)+": ");
        numerog[i]=sc.nextInt();
    }
    System.out.println(" ");
    Arrays.sort(numerog);
    for(int i=numerog.length-1, rank=1 ;i>=0;i--,rank++){
        System.out.println(rank+": "+numerog[i]);
    }

}
public static void Ejercicio20(){
    int contador=0;
    //int randomInt = (int)(Math.random() * (max - min + 1)) + min;
    int []numeroh=new int[1000];
    for(int i=0;i<numeroh.length;i++){
        numeroh[i]=(int)(Math.random()*(99-0+1))+0;
    }
    System.out.print("Escribe un número para saber si está en el array: ");
        int respuesta=sc.nextInt();
        for(int i=0; i<numeroh.length;i++){
            if(i==respuesta){
                System.out.println(numeroh[i]+", ");
                System.out.println("Existe dentro del array");
                contador++;
            }
            System.out.println("Prueba 1 de git");
        }
        System.out.println("Se encontraron "+contador+" veces dentro del Array :D");
}
}
