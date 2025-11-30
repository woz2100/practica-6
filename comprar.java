public boolean comprar(int clave, int cantidad) {
    Producto p = productos.search(clave);

    if (p == null) return false;

    p.setInventario(p.getInventario() + cantidad);
    return true;
}
