import java.util.Scanner;
class EstCondicional{
 static Scanner teclado=new Scanner(System.in);
 static void ejercicio01(){
    //Definir variables y otros
    System.out.println("Ejemplo estructura Condicional en Java");
    int cantidadX=0;
    double montoP=0;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de lapices:");
    cantidadX=teclado.nextInt();
    //Proceso
    if(cantidadX>=1000){
    montoP=cantidadX*0.80;
    }else{
    montoP=cantidadX*0.90;
    }
    //Datos de salida
    System.out.println("El monto a pagar es:"+montoP);
 }
 public static void main(String[] arg){
  ejercicio01();
  }
  }
  def estCondicional02():
  #Definir variables y otros
  print("Ejemplo estructura Condicional en Python 02")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la cantidad de personas:"))
  #Proceso
  if cantidadX<=200:
  montoP=cantidadX*95
  elif cantidadX>200 and cantidadX<=300:
  montoP=cantidadX*85
  else:
  montoP=cantidadX*75
  #Datos de salida
  print("El monto a pagar es:", montoP)
  estCondicional02()
d
