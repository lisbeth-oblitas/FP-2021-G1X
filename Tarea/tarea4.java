import java.util.Scanner;
public class tarea4 {
    static Scanner tecladoJ=new Scanner(System.in);
    public static void hamburguesa() {

    //Declarar Variables y otros
    String tipoPago;
    int cantidad;
    double total=0;
    int contador=1;
    //proceso y datos de Entrada
    while (contador<=3){
        if (contador==1) {
            System.out.println("Ingrese la cantidad de hamburgesas simples:");
            cantidad=tecladoJ.nextInt();
            total=total+cantidad*20;
        }
        if (contador==2) {
            System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
            cantidad=tecladoJ.nextInt();
            total=total+cantidad*25;
        }
        if (contador==3) {
            System.out.println("Ingrese la cantidad de hamburgesas Triples:");
            cantidad=tecladoJ.nextInt();
            total=total+cantidad*28;
        }  
        contador++;                  
    }
    //datos de salida, entrada
    System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
    tipoPago=tecladoJ.next();
    if (tipoPago.toUpperCase().equals("CT")) {
        total=total+total*0.05;
    } 
    System.out.println("El monto total a pagar es:"+total);
}



public static void main(String[] args) {
    hamburguesa();
}
}