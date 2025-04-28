public class Gasto {
    String categoria;
    String descripcion;
    double monto;

    public Gasto(String categoria, String descripcion, double monto) {
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public void agregarMonto(double monto) {
        this.monto += monto;
    }

    @Override
    public String toString() {
        return "Categoría: " + categoria + ", Descripción: " + descripcion + ", Monto: $" + monto;
    }
}
