package controllers;

import com.google.gson.JsonObject;
import controllers.securesocial.SecureSocial;
import models.Usuario;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.With;

import securesocial.provider.SocialUser;
import securesocial.provider.ProviderType;

/**
 *Controlador princiap de la aplicacion
 *
 * @author Rodrigo, Alex e Iza
 * 
*/

//@With(Secure.class)
//@With(SecureSocial.class)
public class Application extends Controller {

    
    /**
     * Metodo que se encarga de la seguriad en la landingpage
     * 
     */
    public static void landingPage() {
        SocialUser user = SecureSocial.getCurrentUser();
        
        render();

    }

    /**
     * Metodo que se encarga del almacenamiento del registro de los usuarios
     * 
     * @param usuario
     * @param nombre
     * @param primerApellido
     * @param email
     * @param password 
     */
    public static void registrarUsuario(String usuario, String nombre, String primerApellido, String email,
            String password) {

        Usuario usuarios = new Usuario(usuario, nombre, primerApellido, email, password);
        usuarios.addUser(usuario, nombre, primerApellido, email, password);
        usuarios.save();
        landingPage();
    }

    /**
     * 
     * Metodo que se encarga de la renderizacion del minijuego
     */
    public static void showMemoramaBanderas() {
        Juegos.memoramaBanderas();
    }

    static Usuario currentUser() {
        SocialUser currentUser = SecureSocial.getCurrentUser();
        return Usuario.find("email", currentUser.email).first();
    }

    static Usuario user(String email) {
        return Usuario.find("email", email).first();
    }

    static boolean isCurrentUser(Usuario user) {
        return currentUser().email.equals(user.email);
    }
}
