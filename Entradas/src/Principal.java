public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Festival", 890.0);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        System.out.println("\nEntrada Record");

        Entrada_Record entradaRecord1 = new Entrada_Record("Obra de Teatro", 450.0);
        Entrada_Record entradaRecord2 = new Entrada_Record("Festival", 900.0);

        entradaRecord1.mostrarInformacion();
        entradaRecord2.mostrarInformacion();
        }
    }