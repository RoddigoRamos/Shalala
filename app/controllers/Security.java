/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import models.Usuario;
import org.hibernate.annotations.Check;
import play.mvc.results.RenderTemplate;


/**
 *
 * Controlador encargado del inicio de sesion de los usuarios
 * 
 * @author alejandro
 */
public class Security extends Secure.Security {
    
    

    static boolean authenticate(String username, String password) {

        Usuario usuario = Usuario.find("byEmail", username).first();
        return usuario != null && usuario.password.equals(password);
    }
    
    
    static void onAuthenticated() {
        Usuario usuario = Usuario.find("byEmail", connected()).first();
        Application.main(); 
    }
    
    /**
     * Metodo encargado de revisar si el usuario es administrador o no
     * 
     * @param profile
     * 
     */
    static boolean check(String profile) {
        Usuario usuario = Usuario.find("byEmail", connected()).first();
        if ("administrador".equals(profile)) {
            return usuario.isAdmin;
        } else {
            return false;
        }
    }

    

}
