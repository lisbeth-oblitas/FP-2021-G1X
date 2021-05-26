import java.util.Scanner;
class tarea5{
static Scanner teclado=new Scanner(System.in);
static void preciosdeproductosGEYV(){
//Definir variables y otros
System.out.println("algoritmo para saber cuanto sde descuento tendra:");
String descuentoGEYV="";//turururu :v  
//datos de entrada:
int precio= teclado.nextInt();
if(precio<=200){
descuentoGEYV="0.15";
}else if (precio>100 && precio<200){
descuentoGEYV="0.12";}
else if (precio<100){
descuentoGEYV="0.10";}
 //Datos de salida:
System.out.println("recibira un descuento de: "+descuentoGEYV);
}
public static void main(String[] arg){preciosdeproductosGEYV();
}
}