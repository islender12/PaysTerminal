public class Persona {
    private String documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;


    public Persona(String documento, String nombre, String apellido, String telefono, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
