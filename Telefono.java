public class Telefono implements IProducto {
    private String nombre;
    private String marca;
    private double precio;

    // CONSTRUCTOR
    public Telefono(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    // MÉTODOS
    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public void imprimeDetallesProducto() {

    }

}
