
package models;

import com.google.code.morphia.annotations.Entity;
import java.util.Date;
import play.data.validation.*;
import play.modules.morphia.Model;

/**
 *
 * Entidad para el almacenamiento de los datos de los usuarios en mongo
 * 
 * @author rodrigo
 */
@Entity
public class Usuario extends Model{
    
    @Required
    @MinSize(value=3)
    public String usuario;
    
    @Email
    @Required
    @Unique
    public String email;
    
    @Password
    public String password;
    
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public Date fechaNacimiento;
    public Integer grado;
    
    public boolean isAdmin;

    public Usuario(){
        
    }
    public Usuario(String usuario,String nombre,String primerApellido, String email, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%s %s ", this.nombre, this.primerApellido);
    }
    
    public Usuario addUser(String usuario,String nombre, String primerApellido, String email, String password){
        Usuario nuevoUsuario = new Usuario(usuario, nombre, primerApellido, 
                email, password);
        //nuevoUsuario.addUser(usuario, email, password);
        this.save();
        return this;
    }

    
    
    
}
