/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Usuario;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

/**
 *
 * @author alejandro
 */
@With(Secure.class)
public class Admin extends Controller{
     @Before
    static void setConnectedUser() {
        if (Security.isConnected()) {
            Usuario usuario = Usuario.find("byEmail", Security.connected()).first();
            renderArgs.put("user", usuario.nombre);

        }
    }
}
