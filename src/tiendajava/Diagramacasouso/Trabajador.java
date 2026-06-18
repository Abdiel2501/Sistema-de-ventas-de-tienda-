package tiendajava.Diagramacasouso;

public abstract class Trabajador {
    public String nombre;
    public String idEmpleado;

    public Trabajador() {
    }

    public Trabajador(String nombre, String idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
}
