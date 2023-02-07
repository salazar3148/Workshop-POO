public class Velero extends Embarcacion{
    private int cantidadMastiles;
    public Velero(Capitan capitan, double precioBase, double eslora, int anioFabricacion, int cantidadMastiles) {
        super(capitan, precioBase, eslora, anioFabricacion);
        this.cantidadMastiles = cantidadMastiles;
    }
    public boolean evaluarVelero(){
        return cantidadMastiles > 4;
    }

    @Override
    public String toString(){
        return "\n-- Velero -- \n" + super.toString() + "\nCantidad de Mastiles: " + cantidadMastiles + ".\n";
    }
}
