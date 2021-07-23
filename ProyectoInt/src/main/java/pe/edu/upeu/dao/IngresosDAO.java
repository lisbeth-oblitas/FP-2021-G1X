package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ConceptosTO;
import pe.edu.upeu.modelo.IngresosTO;
import pe.edu.upeu.modelo.ItinerarioViajesTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;

public class IngresosDAO extends AppCrud {
        Ansi color=new Ansi();
        LeerArchivo  lar;
        ConceptosTO consTO;
        IngresosTO ingresoTO;
        ItinerarioViajesTO itiviTO;
        LeerTeclado tre=new LeerTeclado();
        UtilsX ut=new UtilsX();
        SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");  
        public void ingresos() {
            AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR INGRESOS**|@"));
            mostrarConceptos();
            ingresoTO=new IngresosTO();
            ingresoTO.setIdConceptos(tre.read("", "Indique el concepto:"));
            mostrarItinerario();
            ingresoTO.setIdItineraio(tre.read("", "Indique el itinerario:"));         
            lar=new LeerArchivo("Ingresos.txt");
            ingresoTO.setIdOperacion(generarId(lar, 0, "IN", 2));
            ingresoTO.setFecha(formatoFecha.format(new Date()));
            lar=new LeerArchivo("Itinerario.txt");
            Object[][] datait=buscarContenido(lar, 0, ingresoTO.getIdItineraio());
            lar=new LeerArchivo("Zona.txt");
            Object[][] dataZ=buscarContenido(lar, 0, datait[0][4].toString());
            ingresoTO.setMonto(Double.parseDouble(datait[0][5].toString())*Double.parseDouble(dataZ[0][3].toString()));

            lar=new LeerArchivo("Ingresos.txt");
           
            agregarContenido(lar,ingresoTO);
        }
    
        public void mostrarItinerario() {
            lar=new LeerArchivo("Itinerario.txt");
            Object[][] data=listarContenido(lar);
            String fechaInit=tre.read("", "Ingrese la fecha del itinerario que desea en formato  (dd-MM-yyyy):");
            int cantidadFi=0;
            for (int i = 0; i < data.length; i++) {
                    String[] dataFechaV=String.valueOf(data[i][1]).split(" ");
                    if (fechaInit.equals(dataFechaV[0]) ) { 
                            cantidadFi++;
                    }
                }
                Object[][] dataRealRF=new Object[cantidadFi][data[0].length];
                cantidadFi=0;
            for (int i = 0; i < data.length; i++) {//
                String[] dataFechaV=String.valueOf(data[i][1]).split(" ");
                if (fechaInit.equals(dataFechaV[0]) ) { 
                 System.out.print(data[i][0]+"="+data[i][2]+",");
            }
            }
            System.out.println("");
        }
        public void mostrarConceptos() {
            lar=new LeerArchivo("Concepto.txt");
            Object[][] data=listarContenido(lar);
            
            for (int i = 0; i < data.length; i++) {//
                if (data[i][0].equals("C2")) {
                    System.out.print(data[i][0]+"="+data[i][2]+",");
                }
            }
            System.out.println("");
        }
        
}