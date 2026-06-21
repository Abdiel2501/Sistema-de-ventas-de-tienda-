package tiendajava;

public abstract class Trabajador {
    public String nombre;
    public String idEmpleado;
    public String contraseña;

    public Trabajador() {
    }

    public Trabajador(String nombre, String idEmpleado, String contraseña) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getContraseña() {
        return contraseña;
    }
}
