public class Yate extends Embarcacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double eslora, int anioFabricacion, int cantidadCamarotes) {
        super(capitan, precioBase, eslora, anioFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
    }
    public boolean esDeLujo(){
        return cantidadCamarotes > 7;
    }

    @Override
    public String toString(){
        return "\n-- Yate -- \n" + super.toString() + "\nCantidad de Camarotes: " + cantidadCamarotes + ".\n";
    }
}
