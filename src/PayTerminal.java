public class PayTerminal {

    public static final double RECARGO_X_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;

    public static Ticket efectuarPago(TarjetaCredito tarjetaCredito, double montoAbonar, int cantCuotas)
    {

        Ticket ticketGen = null;

        if (datosValidos(tarjetaCredito,montoAbonar, cantCuotas)){
            double montoFinal = montoAbonar + montoAbonar * recargosSe(cantCuotas);
            if (tarjetaCredito.saldoDisponible(montoFinal)){
                tarjetaCredito.debitaSaldoDisponible(montoFinal);
                String nomApe = tarjetaCredito.nombreYApellido();
                double montoXCuota = montoFinal / cantCuotas;
                ticketGen = new Ticket(nomApe,montoFinal,montoXCuota);
            }
        }

        return ticketGen;
    }

    private static  boolean datosValidos (TarjetaCredito tarjetaCredito, double montoAbonar, int cantCuotas){

        boolean tarjetaValida = tarjetaCredito != null;
        boolean montoValida = montoAbonar > 0;
        boolean cantCuotasValida = cantCuotas >=  MIN_CANT_CUOTAS && cantCuotas <= MAX_CANT_CUOTAS;
        return tarjetaValida && montoValida && cantCuotasValida;

    }

    private static double recargosSe(int cantCuotas){
        return (cantCuotas - 1) * RECARGO_X_CUOTA;
    }
}
