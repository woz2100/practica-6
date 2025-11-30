public void cargarCSV(String ruta) {
    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] x = linea.split(",");

            int clave = Integer.parseInt(x[0]);
            String desc = x[1];
            int inv = Integer.parseInt(x[2]);
            double costo = Double.parseDouble(x[3]);
            double precio = Double.parseDouble(x[4]);

            Producto p = new Producto(clave, desc, inv, costo, precio);
            productos.add(clave, p);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
