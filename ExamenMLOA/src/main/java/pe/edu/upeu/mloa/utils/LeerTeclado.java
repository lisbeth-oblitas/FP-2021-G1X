package pe.edu.upeu.mloa.utils;
import java.io.*;

public class LeerTeclado {
    BufferedReader readerI = new BufferedReader(new InputStreamReader(System.in));

  public int  leer(int valor, String msg) {
      System.out.println(msg);
    try {
        valor=Integer.parseInt(readerI.readLine());
        
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=leer(valor, msg);
        //TODO: handle exception
    }
    return valor;
  }
  public double leer(double valor, String msg) {
    System.out.println(msg);
    try {
        valor=Double.parseDouble(readerI.readLine());
        
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=leer(valor, msg);
        //TODO: handle exception
    }
    return valor;
      
   }
   public char leer(char valor, String msg) {
    System.out.println(msg);
    try {
        valor=readerI.readLine().charAt(0);
        
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=leer(valor, msg);
        //TODO: handle exception
    }
    return valor;
      
   }
   public String leer(String valor, String msg) {
    System.out.println(msg);
    try {
        valor=readerI.readLine();
        
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=leer(valor, msg);
        //TODO: handle exception
    }
    return valor;
      
   }
   public boolean leer(boolean valor, String msg) { 
       System.out.println(msg);
    try {
        valor=Boolean.parseBoolean(readerI.readLine());
        
    } catch (Exception e) {
        System.out.println("Intente de nuevo");
        valor=leer(valor, msg);
        //TODO: handle exception
    }
    return valor;
      
   }
}