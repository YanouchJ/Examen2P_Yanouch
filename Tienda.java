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
        return null;
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        return 0;
    }

    // Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre) {
        // Implementar método
        return true;
    }

}
