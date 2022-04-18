package RepasoConstructores;

public class Producto {
    private Long id;
    private String nombre;
    private Double valor;
    private String codigo;

    /*Gemerando los metodos getters y setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //Para poder imprimir el Objeto hacemos uso del constructor toString


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}



/*Este codigo solo es de repaso de los constructores y el constructor toString como se debe de ocupar*/