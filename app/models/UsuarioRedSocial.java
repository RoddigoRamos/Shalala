/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Model;
/**
 *
 * @author alejandro
 */

@Entity
public class UsuarioRedSocial extends Model{
    
    public String usuario;
    public String token;
    public String secret;

    public UsuarioRedSocial(String usuario) {
        this.usuario = usuario;
        
    }
    
   
    

    public static UsuarioRedSocial findOrCreate(String usuario) {
        UsuarioRedSocial usuarioNombre = UsuarioRedSocial.find("usuario", usuario).first();
        if (usuario == null) {
            usuarioNombre = new UsuarioRedSocial(usuario);
        }
        return usuarioNombre;
    }
    
    
}
