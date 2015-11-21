package controllers;

import com.google.gson.JsonObject;
import controllers.securesocial.SecureSocial;
import models.Usuario;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.With;

import securesocial.provider.SocialUser;
import securesocial.provider.ProviderType;

//@With(Secure.class)
//@With(SecureSocial.class)
public class Application extends Controller {

    public static void landingPage() {
        SocialUser user = SecureSocial.getCurrentUser();
        
        render();

    }

    public static void registrarUsuario(String usuario, String nombre, String primerApellido, String email,
            String password) {

        Usuario usuarios = new Usuario(usuario, nombre, primerApellido, email, password);
        usuarios.addUser(usuario, nombre, primerApellido, email, password);
        usuarios.save();
        landingPage();
    }

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
