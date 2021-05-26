import java.util.Scanner;
public class tarea7 {
    static Scanner tecladoj=new Scanner(System.in);
     public static void salario() {
       //definir variables y otros
         int añosMOA=1;
    double salario=1500;
       //proseso
      while (añosMOA<=6) {
       salario=(salario*0.1)+salario;
       //datos de salida
       System.out.println("su salario de un año es:"+añosMOA+"es:"+salario);
       añosMOA++;   
      }
    }


    public static void main(String[] args) {
        salario();
}
}
