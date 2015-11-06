package controllers;

import com.google.gson.JsonObject;
import controllers.securesocial.SecureSocial;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.With;

import securesocial.provider.SocialUser;
import securesocial.provider.ProviderType;

//@With(Secure.class)
@With(SecureSocial.class)
public class Application extends Controller {

    public static void index() {
        //String usuario = Security.connected();
        SocialUser user = SecureSocial.getCurrentUser();
        if (user.id.provider == ProviderType.facebook) {
            JsonObject me = WS.url("https://graph.facebook.com/me?access_token=%s", user.accessToken).
                    get().getJson().getAsJsonObject();
            
            render(user);
        }
        render();
        
    }
    }


