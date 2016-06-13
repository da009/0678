
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoGr
{
    /**
     * Constructor for objects of class FurgonetaGrande
     */
    public Camion(Enum marca, int ant, int kilometraje, int peso)
    {
        super(marca, ant, kilometraje, peso);
    }
    
    public boolean articulado()
    {
        boolean art = false;
        if(super.getMarca() == Marca.FORD || super.getMarca() == Marca.FIAT)
            art = true;
        return art;
    }
    
    public boolean esCoche()
    {
        return false;
    }
    
    public boolean cumplenMedidas()
    {
        boolean cumplen = false;
        if (getDatoInteres() <= 3000 && getDatoInteres() > 0 && articulado() == true)
            cumplen = true;
        if(getDatoInteres() <= 2000 && articulado() == false)
            cumplen = true;
        return cumplen;
    }
}