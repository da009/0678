
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    private Enum marca;
    private int ant;
    private int kilometraje;
    private int id;

    /**
     * 
     */
    public Vehiculo(Enum marca, int ant, int kilometraje)
    {
        this.marca = marca;
        this.ant = ant;
        this.kilometraje = kilometraje;
    }
    
    public Enum getMarca()
    {
        return marca;
    }
    
    public int getAnt()
    {
        return ant;
    }
    
    public int getKilometraje()
    {
        return kilometraje;
    }
    
    public abstract boolean esCoche();
    
    public abstract int getDatoInteres();
    
    public abstract boolean cumplenMedidas();
}
