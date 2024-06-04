public class Laptop implements IProducto {
    private String modelo;
    private String marca;
    private double precio;
    private int garantia;

    // MÉTODOS

    @Override
    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }

    @Override
    public void imprimeDetallesProducto() {
    }

    // CONSTRUCTOR
    public Laptop(String modelo, String marca, double precio, int garantia) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.garantia = garantia;
    }

}
