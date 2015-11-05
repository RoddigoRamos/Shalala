
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
    
    
}
