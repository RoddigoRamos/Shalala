package controllers;

import com.google.gson.JsonObject;
import controllers.securesocial.SecureSocial;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.With;

import securesocial.provider.SocialUser;
import securesocial.provider.ProviderType;

//@With(Secure.class)
//@With(SecureSocial.class)
public class Application extends Controller {

    public static void landingPage() {
        String usuario = Security.connected();
        
        render();

    }
}
