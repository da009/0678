
/**
 * Write a description of class FurgonetaGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaGrande extends VehiculoGr
{
    /**
     * Constructor for objects of class FurgonetaGrande
     */
    public FurgonetaGrande(Enum marca, int ant, int kilometraje, int peso)
    {
        super(marca, ant, kilometraje, peso);
    }
    
    public boolean esCoche()
    {
        return false;
    }
    
    public boolean cumplenMedidas()
    {
        return true;
    }
}
