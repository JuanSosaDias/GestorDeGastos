import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeGastos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gasto> listaGastos = new ArrayList<>();

        System.out.println("WELCOME !");
        String opcion;

        do {
            System.out.println("\nIngrese la categoría del gasto o '1' si es perdida:");
            String categoria = scanner.nextLine();
            if (categoria.equals("1")) {
                System.out.println("Ingrese una descripción del ingreso:");
            String descripcion = scanner.nextLine();

            System.out.println("Ingrese el monto de ingreso:");
            double monto = Double.parseDouble(scanner.nextLine());

            Entrada entrada = new Entrada(categoria, descripcion, monto);
                break;
            }

            System.out.println("Ingrese una descripción del gasto:");
            String descripcion = scanner.nextLine();

            System.out.println("Ingrese el monto:");
            double monto = Double.parseDouble(scanner.nextLine());

            boolean encontrado = false;
            for (Gasto g : listaGastos) {
                if (g.categoria.equalsIgnoreCase(categoria)) {
                    g.agregarMonto(monto);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                Gasto gasto = new Gasto(categoria, descripcion, monto);
                listaGastos.add(gasto);
            }

            System.out.println("¿Desea agregar otro gasto? (s/n):");
            opcion = scanner.nextLine().toLowerCase();
        } while (opcion.equals("s"));

        System.out.println("\nResumen de gastos:");
        double total = 0;
        for (Gasto g : listaGastos) {
            System.out.println(g);
            total += g.monto;
        }

        System.out.println("Gasto total: $" + total);
        scanner.close();
    }
}
