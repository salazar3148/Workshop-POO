public class Embarcacion {
    protected Capitan capitan;
    protected double precioBase, valorAdicional,eslora;
    protected int anioFabricacion;

    public Embarcacion(Capitan capitan, double precioBase, double eslora, int anioFabricacion) {
        this.capitan = capitan;
        this.anioFabricacion = anioFabricacion;
        this.precioBase = precioBase;
        this.valorAdicional = calcularvalorAdicional();
        this.eslora = eslora;
    }
    public double calcularCosto(){
        return precioBase + valorAdicional;
    }
    public double calcularvalorAdicional(){
        return verificarAnio() ? 20000: 0;
    }
    public boolean verificarAnio(){
        return anioFabricacion > 2020;
    }
    @Override
    public String toString() {
        return  capitan + "\nPrecio Base: " + precioBase + "\nValor Adicional: " + valorAdicional + "\nEslora: "
                + eslora + "\nAño de fabricacion: " + anioFabricacion + "\n";
    }
}
