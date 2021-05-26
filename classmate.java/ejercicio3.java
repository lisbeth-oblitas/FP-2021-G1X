import java.util.Scanner;
class sueldo{
static Scanner teclado=new Scanner(System.in);
static void ejercicio3(){
//Definir variables y otros
System.out.println("ingrese sueldo");
  String sueldo=""; 
  //datos de entrada
  int sueldodelapersona= teclado.nextInt();
  if(sueldodelapersona>5000){
  sueldo="pagara impuestos";
  }
  else(sueldodelapersona<=5000){
  sueldo="no pagara impuestos";}
  
  //Datos de salida:
  System.out.println("devera de pagar un impuesto de: "+sueldo);
  }
public static void main(String[] args){
  ejercicio3();
}