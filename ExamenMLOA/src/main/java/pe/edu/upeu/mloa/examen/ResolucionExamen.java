package pe.edu.upeu.mloa.examen;


import java.util.Scanner;

import pe.edu.upeu.mloa.utils.LeerTeclado;

public class ResolucionExamen {
    Scanner Teclado =new Scanner(System.in);
    LeerTeclado teclado=new LeerTeclado();

    public  void CompañiaAutomotriz() {
        int categoria, cant1=0,imp1=12,imp2=8,imp3=5;
        do {
            categoria=teclado.leer(0,"¿Que categoria es su automovil: 1-2-3?");
            
        switch (categoria) {
            case 1:
                cant1=teclado.leer(0,"cuantos automoviles tiene en la categoria 1");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp1+"%");
                }
                System.out.println("De toda la categoria debe pagara"+imp1+"%");
                break;
            case 2:
                cant1=teclado.leer(0,"cuantos automoviles tiene en la categoria 2");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Ustes debe pagar: "+imp2+"%");
               }
               System.out.println("De toda la categoria se pagara"+imp2+"%");
                break;
            case 3:
                cant1=teclado.leer(0,"cuantos automoviles tiene en la categoria 3");
                for (int j = 0; j < cant1; j++) {
                System.out.println("Usted debe pagar: "+imp3+"%");
                }
                System.out.println("De toda la categoria debera pagar"+imp3+"%");
                break;
            default:System.out.println("incorrecto--escoja entre 1-2-3");
                break;
        }
        }
    
    while (categoria!=0);
 }  
 
    public  void tabla() {
        int numero=1;

        for (int i = 0; i <20; i++) {
        for (int j = 1; j <=10; j++) {
            System.out.println(numero+"x"+j+"="+(j*numero));
            
        }
        numero=numero+1;
        System.out.println("......");
        }
    }
    
    
        public void cuadrados() {
            
        System.out.println("ingrese un numero :");
  
        if(isPerfect(Teclado.nextInt()))
      
        System.out.println("El numero ingresado es perfecto :");
      
        else
       
        System.out.println("El numero ingresado no es perfecto :");
      
      
      }
      public static boolean isPerfect(int number) {
        boolean boo1 =false;
        int addDivisors = 0, divisor=1;
        while(divisor  <= number/2 ) {
     
        if ( number % divisor == 0)
           addDivisors += divisor;
           divisor++;
     
        }
     
        if (addDivisors == number)
        boo1= true;
     
        return boo1;
     
       }
     
            
        
        

        public int potenciamloa(int b, int e) {
            if (e==1) {
                return b;
            } if (e==0) {
                return 1;
            } else{
                return b * potenciamloa(b, e-1);
            }

}
}