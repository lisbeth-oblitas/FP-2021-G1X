package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ConceptosTO;
import pe.edu.upeu.modelo.EgresosTO;
import pe.edu.upeu.modelo.OperacionEgresosTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;

public class EgresosDAO extends AppCrud{
    Ansi color=new Ansi();
    LeerArchivo  lar;
    ConceptosTO consTO;
    EgresosTO egresoTO;
    OperacionEgresosTO opeTO;
    
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();
    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");  
    
    public void egresos() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR  EGRESOS**|@"));
        mostrarCategoriaConceptos();
        egresoTO=new EgresosTO();
        egresoTO.setIdConceptos(tre.read("", "Indique el concepto:"));
        mostrarCategoria();
        egresoTO.setIdOperacionEgreso(tre.read("", "Indique la operacion egreso:"));
        mostrarCategoriaIT();
        egresoTO.setIdItineraio(tre.read("", "Indique el itinerario:"));         
        lar=new LeerArchivo("Egresos.txt");
        egresoTO.setIdOperacion(generarId(lar, 0, "E", 1));
        egresoTO.setFecha(formatoFecha.format(new Date()));
        egresoTO.setMonto(tre.read(0.0,"Ingrese el monto del egreso"));
        lar=new LeerArchivo("Egresos.txt");
        agregarContenido(lar,egresoTO);
    }

    public void mostrarCategoria() {
        lar=new LeerArchivo("OperacionEgreso.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+", ");
        }
        System.out.println("");
    }

    public void mostrarCategoriaConceptos() {
      
        lar=new LeerArchivo("Concepto.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 1; i < data.length; i++) { 
           
                System.out.print(data[i][0]+"="+data[i][2]+", ");
        
        }
        System.out.println("");
    }
    
    public void mostrarCategoriaIT() {
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
    
}