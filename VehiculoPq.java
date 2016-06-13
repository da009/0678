
/**
 * Write a description of class VehiculoPq here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPq extends Vehiculo
{
    private int plazas;
    /**
     * Constructor for objects of class VehiculoPq
     */
    public VehiculoPq(Enum marca, int ant, int kilometraje, int plazas)
    {
        super(marca, ant, kilometraje);
        this.plazas = plazas;
    }
    
    public int getDatoInteres()
    {
        return plazas;
    }
    
    public abstract boolean esCoche();
    
    public abstract boolean cumplenMedidas();
}
