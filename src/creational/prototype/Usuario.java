package src.creational.prototype;

public class Usuario implements Cloneable {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    @Override
    public Usuario clone() {
        Usuario cloneUsuario = new Usuario();
        cloneUsuario.setNombre(this.nombre);
        cloneUsuario.setApellido(this.apellido);
        cloneUsuario.setEdad(this.edad);
        cloneUsuario.setEstadoCivil(this.estadoCivil);
        return cloneUsuario;
    }
}
