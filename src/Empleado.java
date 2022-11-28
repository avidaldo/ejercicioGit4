import java.util.Date;

class Empleado {
    final String nombre;
    int edad;
    final Date fechaContratacion;

    public Empleado(String nombre, int edad, Date fechaContratacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";
    }

}