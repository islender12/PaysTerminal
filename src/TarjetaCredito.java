public class TarjetaCredito {
    private String nameBank;
    private String numberCard;
    private double saldoDisponible;
    private Persona persona;
    private TipoTarjeta tipoTarjeta;

    public TarjetaCredito(String nameBank, String numberCard, double saldoDisponible, Persona persona,  TipoTarjeta tipoTarjeta) {
        this.nameBank = nameBank;
        this.numberCard = numberCard;
        this.saldoDisponible = saldoDisponible;
        this.persona = persona;
        this.tipoTarjeta = tipoTarjeta;
    }

    public boolean saldoDisponible(double monto) {
        return saldoDisponible >= monto;
    }

    public void debitaSaldoDisponible(double monto) {
        saldoDisponible -= monto;
    }

    public String nombreYApellido() {
        return persona.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nameBank='" + nameBank + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", saldoDisponible=" + saldoDisponible +
                ", persona=" + persona +
                ", tipoTarjeta=" + tipoTarjeta +
                '}';
    }
}

