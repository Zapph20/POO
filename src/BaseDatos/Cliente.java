
package BaseDatos;

/**
 * @author Axel Yamir CT
 */
public class Cliente {
    int id;
    String dni;
    String nom;
    String telefono;
    String estado;

    public Cliente() {
    }

    public Cliente(int id, String dni, String nom, String telefono, String estado) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
   
}
