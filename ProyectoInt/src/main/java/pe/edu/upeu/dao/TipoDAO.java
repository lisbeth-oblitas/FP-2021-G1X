package pe.edu.upeu.dao;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.TipoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class TipoDAO extends AppCrud{
    Ansi color=new Ansi();
    LeerArchivo lar;
    TipoTO tipto;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarTipo() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR TIPO**|@"));
        tipto=new TipoTO();
        lar=new LeerArchivo("Tipo.txt");
        tipto.setIdTipo(generarId(lar,0,"T", 1));
        tipto.setNombre(tre.read("", "Ingrese nombre del tipo:"));
        agregarContenido(lar, tipto);
        
    }

    public void reporteTipo() {
        lar=new LeerArchivo("Tipo.txt");
        imprimirLista(listarContenido(lar));
    }
}
