
/**
 * Write a description of class FurgonetaPequena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoPq
{
    /**
     * Constructor for objects of class Coche
     */
    public FurgonetaPequena(Enum marca, int ant, int kilometraje, int plazas)
    {
        super(marca, ant, kilometraje, plazas);
    }
    
    public boolean esCoche()
    {
        return false;
    }
    
    public boolean cumplenMedidas()
    {
        boolean cumplen = false;
        if (getDatoInteres() <= 7 && getDatoInteres() > 0)
            cumplen = true;
        return cumplen;
    }
}
