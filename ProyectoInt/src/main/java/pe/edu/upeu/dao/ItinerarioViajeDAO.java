package pe.edu.upeu.dao;



import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ItinerarioViajesTO;
import pe.edu.upeu.modelo.VehiculoTO;
import pe.edu.upeu.modelo.ZonaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;


public class ItinerarioViajeDAO extends AppCrud {
    Ansi color=new Ansi();
    LeerArchivo  lar;
    VehiculoTO vehTO;
    ItinerarioViajesTO itiviTO;
    ZonaTO zonaTO;
    
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();
   
    public void registrarItinerarioViajes() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR ITINERARIOS**|@"));
        mostrarItinerarios();
        itiviTO=new ItinerarioViajesTO();
        itiviTO.setIdVehiculo(tre.read("", "Seleccione el vehiculo:"));
        mostrarCategoriaZona();
        itiviTO.setZona(tre.read("", "Seleccione la zona:"));         
        lar=new LeerArchivo("Itinerario.txt");
        itiviTO.setIdItinerario(generarId(lar, 0, "IT", 2));
        itiviTO.setFecha(tre.read("","Ingrese la fecha formato dd-MM-yyyy"));
        itiviTO.setHoraSalida(tre.read("","Ingrese hora formato 24 horas"));
        itiviTO.setCanPasaje(tre.read(0, "Indique cuantos pasajeros van en el vehiculo"));
        lar=new LeerArchivo("Itinerario.txt");
        agregarContenido(lar,itiviTO);
    }

    public void mostrarItinerarios() {
        lar=new LeerArchivo("Vehiculo.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+", ");
        }
        System.out.println("");
    }
    public void mostrarCategoriaZona() {
        lar=new LeerArchivo("Zona.txt");
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {//
            System.out.print(data[i][0]+"="+data[i][1]+"-"+data[i][2]+", ");
        }
        System.out.println("");
    }
}