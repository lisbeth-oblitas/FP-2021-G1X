import java.util.Scanner;
public class tarea8 {
    static Scanner teclado=new Scanner(System.in);
    public static void ahorropesos() {
        //definir variables y otros
        int ahorroMOA=1;
        int variableMOA=1;
         //proseso 
        while (ahorroMOA<=365) {
            variableMOA*=3;
        ahorroMOA++; 
        }
        //datos de salida
System.out.println("los dias que ahorro es de: "+(ahorroMOA-1)+":");
System.out.println("su ahorro en un año es:"+variableMOA );

    }
public static void main(String[] args) {
    ahorropesos();
}
}