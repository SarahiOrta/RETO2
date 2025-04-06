public record Entrada_Record (String Nombre, double Precio) {
    public void mostrarInformacion() {
       System.out.println(" Evento: " + Nombre + " Precio: $ " + Precio);
    }
}