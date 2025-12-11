//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PayTerminal pos = new PayTerminal();
        Persona persona = new Persona("14888547", "Juan", "Perez", "04148857441", "devjava@gmail.com");
        TarjetaCredito tarjetaCredito = new TarjetaCredito("Sofitasa", "5488123412357894", 15000, persona, TipoTarjeta.MASTERCARD);

        System.out.println(tarjetaCredito);

        Ticket ticket = PayTerminal.efectuarPago(tarjetaCredito, 10000, 5);

        System.out.println(ticket);

        System.out.println(tarjetaCredito);

        System.out.println(" ");

        Ticket ticket2 = PayTerminal.efectuarPago(tarjetaCredito, 10000, 5);

        System.out.println(ticket2);

        System.out.println(tarjetaCredito);
    }
}