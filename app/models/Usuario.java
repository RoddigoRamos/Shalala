
package models;

import com.google.code.morphia.annotations.Entity;
import java.util.Date;
import play.data.validation.*;
import play.modules.morphia.Model;

/**
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

    public Usuario(String usuario, String email, String password) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.grado = grado;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return String.format("%s %s ", this.nombre, this.primerApellido);
    }
    
    
    
    
}
