package pe.edu.upeu.dao;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

//import static org.fusesource.jansi.Ansi.Color.*;

import java.text.SimpleDateFormat;
public class ReporteInyEgreDAO extends AppCrud{
    Ansi color=new Ansi();
    LeerArchivo  lar;
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");
   public void reportarIngresosyEgresos() {
    reportarIngresosRangoFecha();

   }
    public void reportarIngresosRangoFecha(){
        double  total=0;
        AnsiConsole.systemInstall();
        lar=new LeerArchivo("Ingresos.txt");
        System.out.println(color.render("| @|green **REPORTE DE INGRESOS**|@"));
        String fechaInit=tre.read("", "Ingrese la fecha de Inicio (dd-MM-yyyy):");
        String fechaFin=tre.read("", "Ingrese fecha final (dd-MM-yyyy):");
        Object[][] dataV=listarContenido(lar);
        int cantidadFi=0;
        try {
            for (int i = 0; i < dataV.length; i++) {
                String[] dataFechaV=String.valueOf(dataV[i][1]).split(" ");
                if ((formatoFecha.parse(dataFechaV[0].toString()).after(formatoFecha.parse(fechaInit)) || 
                    dataFechaV[0].equals(fechaInit))   && (
                        formatoFecha.parse(dataFechaV[0].toString()).before(formatoFecha.parse(fechaFin)) || 
                    dataFechaV[0].equals(fechaFin)
                    )) {
                        cantidadFi++;
                }
            }
            System.out.println("Cantidad:"+cantidadFi);
            Object[][] dataRealRF=new Object[cantidadFi][dataV[0].length];
            cantidadFi=0;
            

            for (int i = 0; i < dataV.length; i++) {
                String[] dataFechaV=String.valueOf(dataV[i][1]).split(" ");
                if ((formatoFecha.parse(dataFechaV[0].toString()).after(formatoFecha.parse(fechaInit)) || 
                    dataFechaV[0].equals(fechaInit))   && (
                        formatoFecha.parse(dataFechaV[0].toString()).before(formatoFecha.parse(fechaFin)) || 
                    dataFechaV[0].equals(fechaFin)
                    )) {
                        for (int j = 0; j < dataV[0].length; j++) {
                            dataRealRF[cantidadFi][j]=dataV[i][j];   
                           
                            if (j==4) { total=total+Double.parseDouble(dataV[i][j].toString()); }
                        }
                        cantidadFi++;
                }
            }

            ut.clearConsole();
            System.out.println("*******************Reporte de Ingresos por fecha*****************");
            System.out.println("--------Entre "+fechaInit+" a "+fechaFin+"------------");
            ut.pintarLine('H', 40);         
            ut.pintarTextHeadBody('H', 3, "ID,FECHA,IdConceptos,Iditinerario,Monto S/.");              
            System.out.println(""); 
            ut.pintarLine('H', 40);            
            for (Object[] objects : dataRealRF) {
                String datacontent=""+objects[0]+","+objects[1]+","+objects[2]+","+
                objects[3]+","+objects[4];
                ut.pintarTextHeadBody('B', 3, datacontent);
            }            
            ut.pintarLine('H', 40);
            System.out.println(color.render("RESUMEN INGRESOS:  | @|red Monto Total S/.|@ "+(Math.round(total*100.0)/100.0)));
            ut.pintarLine('H', 40);
         
            
            
        } catch (Exception e) {
            System.out.println("Error-------"+e.getMessage());
            
        }
        
        double egresos=reportarEgresosRangoFecha(fechaInit, fechaFin);
        color=new Ansi();
        ut.pintarLine('H', 40);
        System.out.println(color.render("| @|red Utilidad S/.|@ "+(Math.round((total-egresos)*100.0)/100.0)));
        ut.pintarLine('H', 40);
    }

    public double reportarEgresosRangoFecha(String fechaInit,String fechaFin){
        double monto=0;
        AnsiConsole.systemInstall();
        lar=new LeerArchivo("Egresos.txt");
        System.out.println("************************Reporte de Egresos por fechas*************************");
        /*String fechaInit=tre.read("", "Ingrese la fecha de Inicio (dd-MM-yyyy):");
        String fechaFin=tre.read("", "Ingrese fecha final (dd-MM-yyyy):");*/
        Object[][] dataV=listarContenido(lar);
        int cantidadFi=0;
        try {
            for (int i = 0; i < dataV.length; i++) {
                String[] dataFechaV=String.valueOf(dataV[i][1]).split(" ");
                if ((formatoFecha.parse(dataFechaV[0].toString()).after(formatoFecha.parse(fechaInit)) || 
                    dataFechaV[0].equals(fechaInit))   && (
                        formatoFecha.parse(dataFechaV[0].toString()).before(formatoFecha.parse(fechaFin)) || 
                    dataFechaV[0].equals(fechaFin)
                    )) {
                        cantidadFi++;
                }
            }
            System.out.println("Cantidad:"+cantidadFi);
            Object[][] dataRealRF=new Object[cantidadFi][dataV[0].length];
            cantidadFi=0;
            

            for (int i = 0; i < dataV.length; i++) {
                String[] dataFechaV=String.valueOf(dataV[i][1]).split(" ");
                if ((formatoFecha.parse(dataFechaV[0].toString()).after(formatoFecha.parse(fechaInit)) || 
                    dataFechaV[0].equals(fechaInit))   && (
                        formatoFecha.parse(dataFechaV[0].toString()).before(formatoFecha.parse(fechaFin)) || 
                    dataFechaV[0].equals(fechaFin)
                    )) {
                        for (int j = 0; j < dataV[0].length; j++) {
                            dataRealRF[cantidadFi][j]=dataV[i][j];   
                           
                            if (j==5) { monto=monto+Double.parseDouble(dataV[i][j].toString()); }
                        }
                        cantidadFi++;
                }
            }

            //ut.clearConsole();
            System.out.println("*******************Reporte de Egresos*****************");
            System.out.println("--------Entre "+fechaInit+" a "+fechaFin+"------------");
            ut.pintarLine('H', 40);         
            ut.pintarTextHeadBody('H', 3, "ID,FECHA,IdConceptos,IdOperEgresos,Iditinerario,Monto S/.");              
            System.out.println(""); 
            ut.pintarLine('H', 40);            
            for (Object[] objects : dataRealRF) {
                String datacontent=""+objects[0]+","+objects[1]+","+objects[2]+","+
                objects[3]+","+objects[4]+","+objects[5];
                ut.pintarTextHeadBody('B', 3, datacontent);
            }  
            color=new Ansi();          
            ut.pintarLine('H', 40);
            System.out.println(color.render("RESUMEN:  | @|red Monto Total S/.|@ "+(Math.round(monto*100.0)/100.0)));
            ut.pintarLine('H', 40);
           
            
            
        } catch (Exception e) {
            System.out.println("Error-------"+e.getMessage());
        }
        return monto;
    }
    public void ganancia(double monto,double total) {
    double ganancia=total-monto;
        System.out.println("La ganancia es:"+ganancia);
    }
}