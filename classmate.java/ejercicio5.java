import java.util.Scanner;

public class ejercicio5 {
    static Scanner teclado=new Scanner(System.in);
    public static void contadordenumero() {
    //definir variables
    int contador=1,cantidad;
    //datos de entrada
    System.out.println("ingrese el numero");
    cantidad=teclado.nextInt();
    //proceso
    while (contador<=cantidad) {
        System.out.println(contador+"holiii");
        contador++;
        
    }    
    }   
    public static void main(String[] args) {contadordenumero();}
}
