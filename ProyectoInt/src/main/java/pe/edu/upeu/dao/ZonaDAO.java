package pe.edu.upeu.dao;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ZonaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ZonaDAO extends AppCrud{
    Ansi color=new Ansi();
    LeerArchivo lar;
    ZonaTO zonaTO;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarZona() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR ZONAS**|@"));
        zonaTO=new ZonaTO();
        lar=new LeerArchivo("Zona.txt");
        zonaTO.setIdZona(generarId(lar,0,"Z", 1));
        zonaTO.setLugarOrigen(tre.read("", "Ingrese lugar de origen:"));
        zonaTO.setLugarDestino(tre.read("", "Ingrese lugar destino:"));
        zonaTO.setPasajeReferencia(tre.read(0.0, "Ingrese costo del Pasaje:"));
        agregarContenido(lar, zonaTO);
        
    }

    public void reporteZona() {
        lar=new LeerArchivo("Zona.txt");
        imprimirLista(listarContenido(lar));
    }
}