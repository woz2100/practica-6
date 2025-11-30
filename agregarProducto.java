public void agregarProducto(Producto p) {
    productos.add(p.getClave(), p);
}

 Buscar Producto
public Producto buscarProducto(int clave) {
    return productos.search(clave);
}


