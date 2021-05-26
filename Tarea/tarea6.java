import java.util.Scanner;
class tarea6{
static Scanner teclado=new Scanner(System.in);
static void sueldosemanal(){
//Definir variables y otros
System.out.println("verifique su sueldo, ingrese la cantidad que gana");
String descuenta="";
//datos de entrada:
int ganancias= teclado.nextInt();
if(ganancias<=150){
descuenta="0.5";
}else if (ganancias>150 && ganancias<300){
 descuenta="0.7";}
 else if (ganancias>300 && ganancias<450){
 descuenta="0.9";}
  //Datos de salida:
  System.out.println("se le descontara : "+descuenta);
}
public static void main(String[] arg){sueldosemanal();}
}