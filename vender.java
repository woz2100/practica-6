public double vender(int clave, int cantidad) {
    Producto p = productos.search(clave);

    if (p == null) return -1;                // No existe
    if (cantidad > p.getInventario()) return -2; // No hay stock

    p.setInventario(p.getInventario() - cantidad);
    return cantidad * p.getPrecio();
}
