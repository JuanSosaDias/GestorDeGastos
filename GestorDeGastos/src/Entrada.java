public class Entrada {
    String categoria;
    String descripcion;
    double monto;

    public Entrada(String categoria, String descripcion, double monto) {
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.monto = -monto;
    }

    public void restarMonto(double monto) {
        this.monto -= monto;
    }

    @Override
    public String toString() {
        return "Categoría: " + categoria + ", Descripción: " + descripcion + ", Monto: $" + monto;
    }
}
