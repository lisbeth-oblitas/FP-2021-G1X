package pe.edu.upeu.dao;

import java.io.Console;
import java.security.MessageDigest;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import java.math.*;

public class UsuarioDAO extends AppCrud{
    Ansi color=new Ansi();
    LeerArchivo lar;
    UsuarioTO usuTO;

    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX(); 
    
    public static String MD5(String s) throws Exception {
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(s.getBytes(),0,s.length());     
        return new BigInteger(1,m.digest()).toString(16); }

    public void registrarUsuario() {
        AnsiConsole.systemInstall();
        System.out.println(color.render("| @|green **REGISTRAR USUARIOS**|@"));
        usuTO=new UsuarioTO();
        String usuario=tre.read("", "Ingrese un usuario").toLowerCase();
        if (validExist(usuario)) {
            usuTO.setUsuario(usuario);
        usuTO.setPerfil(tre.read("","Ingrese el perfil(ADMIN,SECRETARIO)").toUpperCase());
        lar = new LeerArchivo("Usuario.txt");
        usuTO.setIdUsuario(generarId(lar, 0, "U", 1));
        Console cons=System.console();
        System.out.println("Ingrese su clave");
        char[] clave=cons.readPassword();
        try {
            String md5 = MD5(String.valueOf(clave));
            usuTO.setClave(md5);
        } catch (Exception e) {
            //TODO: handle exception
        }
       
       
        lar=new LeerArchivo("Usuario.txt");
        agregarContenido(lar, usuTO);
        } 
        else {
            System.out.println("El usuario ya existe intenta con otro usuario");
            registrarUsuario();
        }
        }

        public boolean validExist(String usuario) {
            lar=new LeerArchivo("Usuario.txt");
            Object[][] data=buscarContenido(lar, 1, usuario);
            if (data!=null && data.length>0) {
                return false;
            }        
            return true;
        }

        public boolean login(String usuario, char[] clave) {
            lar=new LeerArchivo("Usuario.txt");
            try {
                Object[][] data=buscarContenido(lar, 1, usuario);
            if (data!=null && data.length==1 && data[0][2].equals(MD5(String.valueOf(clave)))) 
                return true;
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            return false;
        }

        }