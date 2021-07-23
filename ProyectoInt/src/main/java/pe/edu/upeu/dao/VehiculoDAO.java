package pe.edu.upeu.dao;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.VehiculoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VehiculoDAO extends AppCrud {
    Ansi color=new Ansi();
    LeerArchivo lar;
    VehiculoTO vehTO;

    LeerTeclado tre=new LeerTeclado ();
    UtilsX ut=new UtilsX();

    public void registrarVehiculos() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR VEHICULOS**|@"));
        vehTO=new VehiculoTO();
        lar=new LeerArchivo("Vehiculo.txt");
        vehTO.setIdVehiculos(generarId(lar,0,"V", 1));
        vehTO.setPlaca(tre.read("", "Ingrese la placa del vehiculo:"));
        vehTO.setCantAsiento(tre.read(0, "Ingrese la cantidad de asientos:"));
        agregarContenido(lar, vehTO);
        
    }

    public void reporteVehiculos() {
        lar=new LeerArchivo("Vehiculo.txt");
        imprimirLista(listarContenido(lar));
    }
}