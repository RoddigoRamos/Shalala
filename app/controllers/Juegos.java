package controllers;

import play.mvc.Controller;

/**
 *Controlador encargado del minijuego
 * 
 * 
 * @author rodrigo
 */
public class Juegos extends Controller{

    /**
     * Método que se encarga de la renderización del minijuego
     */
    public static void memoramaBanderas(){
        renderTemplate("juegos/memoramaBanderas.html");
    }

}
