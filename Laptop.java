public class Laptop implements IProducto {
    private String nombre;
    private String marca;
    private double precio;
    private int garantia;

    // CONSTRUCTOR
    public Laptop(String nombre, String marca, double precio, int garantia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.garantia = garantia;
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
