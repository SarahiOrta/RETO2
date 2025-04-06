public class Entrada {
    String Evento;
    double Precio;

    public Entrada (String evento, double precio) {
        this.Evento = evento;
        this.Precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println (" Evento: " + Evento + " Precio: $ " + Precio);
    }
}