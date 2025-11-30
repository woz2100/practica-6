public double inversionTotal() {
    return inversionRec(productos.getRaiz());
}

private double inversionRec(Nodo<Integer, Producto> r) {
    if (r == null)
        return 0;

    Producto p = r.getItem();
    double actual = p.getInventario() * p.getCosto();

    return actual +
           inversionRec(r.getIzq()) +
           inversionRec(r.getDer());
}
