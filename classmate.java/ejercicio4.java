import java.util.Scanner;
public class ejercicio4{
    static Scanner teclado=new Scanner(System.in);
    public static void name() {
        //definir variables
        int variable1,variable2;
        //datos de entrada
        System.out.println("ingrese la variable1:");
        variable1=teclado.nextInt();
        System.out.println("ingrese la variable2:");
        variable2=teclado.nextInt();
        //proceso
        if (variable1>variable2) {
            System.out.println("el numero mayor es: "+variable1);
            
        }
        else {
           System.out.println("el numero mayor es:" +variable2) ;
            
        }
    }
    public static void main(String[] args) {
     name();   
    } 
}
