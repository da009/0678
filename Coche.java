
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoPq
{
    /**
     * Constructor for objects of class Coche
     */
    public Coche(Enum marca, int ant, int kilometraje, int plazas)
    {
        super(marca, ant, kilometraje, plazas);
    }
    
    public boolean cumplenMedidas()
    {
        boolean cumplen = false;
        if (getDatoInteres() <= 5 && getDatoInteres() > 0)
            cumplen = true;
        return cumplen;
    }
    
    public boolean esCoche()
    {
        return true;
    }
    
    public int getAñosRevision()
    {
        int revision = 1;
        if(super.getMarca() == Marca.FORD)
            revision = 2;
        return revision;
    }
}
