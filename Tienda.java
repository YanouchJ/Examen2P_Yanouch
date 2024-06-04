import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    // MÉTODOS
    @Override
    public void agregarProducto(IProducto producto) {
    }

    @Override
    public void listarProductos() {

    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        int telefono = 800;
        int laptop = 2500;
        int Tablet = 1100;
        if (telefono > laptop || telefono > Tablet) {
            System.out.println("Telefono");
        }
        if (laptop > telefono || laptop > Tablet) {
            System.out.println("Laptop");
        }
        if (Tablet > laptop || Tablet > telefono) {
            System.out.println("Tablet");
        }
        return null;
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        return 0;
    }

    // Getter y Setter
    public List<IProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<IProducto> productos) {
        this.productos = productos;
    }

    // Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String modelo) {
        // Implementar método
        return true;
    }

}
