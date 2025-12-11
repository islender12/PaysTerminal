public class Ticket {

    private String nombreYApellido;
    private double montoTotal;
    private double montoXCuota;

    public Ticket(String nombreYApellido, double montoTotal, double montoXCuota) {
        this.nombreYApellido = nombreYApellido;
        this.montoTotal = montoTotal;
        this.montoXCuota = montoXCuota;

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "nombreYApellido='" + nombreYApellido + '\'' +
                ", montoTotal=" + montoTotal +
                ", montoXCuota=" + montoXCuota +
                '}';
    }
}
