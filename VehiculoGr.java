
/**
 * Write a description of class VeiculoGr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoGr extends Vehiculo
{
    private int peso;
    /**
     * Constructor for objects of class VeiculoGr
     */
    public VehiculoGr(Enum marca, int ant, int kilometraje, int peso)
    {
        super(marca, ant, kilometraje);
        this.peso = peso;
    }
    
    public int getDatoInteres()
    {
        return peso;
    }
    
    
    public abstract boolean esCoche();
    
    public abstract boolean cumplenMedidas();
}
