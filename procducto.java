public class Producto {
    private int clave;
    private String descripcion;
    private int inventario;
    private double costo;
    private double precio;

    public Producto(int clave, String descripcion, int inventario, double costo, double precio) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.inventario = inventario;
        this.costo = costo;
        this.precio = precio;
    }

    public int getClave() { return clave; }
    public String getDescripcion() { return descripcion; }
    public int getInventario() { return inventario; }
    public double getCosto() { return costo; }
    public double getPrecio() { return precio; }

    public void setInventario(int inventario) { this.inventario = inventario; }
}

