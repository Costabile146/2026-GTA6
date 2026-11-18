public class PcL1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        hola(2,6);
        int a=1;
        int b=2;
        int c=hola1(a,b);
        System.out.println(c);
        saluda();
    }
    public static void hola(int a, int b){
        int c= a+b; 
        System.out.println(c);
    }
    public static int hola1(int a, int b){
        int c=a+b;
        return c;
    }
    public static void saluda(){
        String n="Andre";
        System.out.println(n);
    }
}
