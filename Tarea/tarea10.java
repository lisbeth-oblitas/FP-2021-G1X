import java.util.Scanner;
public class tarea10 {
    static Scanner tecladoj=new Scanner(System.in);
     public static void salariodocente() {
       //definir variables y otros
         int añosM=1;
    double salario=1500;
       //proseso
      while (añosM<=6) {
       salario=(salario*0.1)+salario;
       //datos de salida
       System.out.println("su salario del año es:"+añosM+"es:"+salario);
       añosM++;   
      }
    }


    public static void main(String[] args) {
        salariodocente();
}
}