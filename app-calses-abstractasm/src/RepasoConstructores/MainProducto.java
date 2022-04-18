package RepasoConstructores;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setId(1L);
        producto.setValor(154d);
        producto.setCodigo("5465dfs");
        producto.setNombre("Pila");

        System.out.println(producto);

    }
}
