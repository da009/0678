
/**
 * Write a description of class FlotaAmazon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private Vehiculo[] list;

    /**
     * Constructor for objects of class FlotaAmazon
     */
    public Flota()
    {
        list = new Vehiculo[0];
    }

    /**
     * Añade un elemento a la colección al final de la misma
     */
    public void addVehiculo(Vehiculo vehiculo)
    {
        Vehiculo [] num;
        num = list;
        list = new Vehiculo [num.length +1];
        for (int cont = 0; cont < num.length; cont++)
            list[cont] = num[cont];
        list[num.length] = vehiculo;
    } 
    
    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public void remove(int id)
    {
        if(id >= 0 && id < list.length)
        {
            Vehiculo[] nuevoArray = list;
            list = new Vehiculo[list.length -1];
        }
        else
            System.out.println("El id introducido no es válido");
    }
    
    public Enum marcaMayoritaria()
    {
        Enum marcaMayoritaria = null;
        int ford = 0;
        int opel = 0;
        int citroen = 0;
        int fiat = 0;
        for(Vehiculo vehiculo : list)
        {
            if(vehiculo.getMarca() == Marca.FORD)
                ford++;
            else if (vehiculo.getMarca() == Marca.OPEL)
                opel++;
            else if (vehiculo.getMarca() == Marca.CITROEN)
                citroen++;
            else
                fiat++;
        }
        if(ford>opel && ford>citroen && ford>fiat)
            marcaMayoritaria = Marca.FORD;
        else if(opel>ford && opel>citroen && opel>fiat)
            marcaMayoritaria = Marca.OPEL;
        else if(citroen>ford && citroen>opel && citroen>fiat)
            marcaMayoritaria = Marca.CITROEN;
        else if(fiat>ford && fiat>opel && fiat>citroen)
            marcaMayoritaria = Marca.FIAT;
        return marcaMayoritaria;
    }
    
    public boolean cumplenMedidas()
    {
        boolean todosCumplen = true;
        int cont = 0;
        while(cont <= list.length && !todosCumplen)
        {
            if(list[cont].cumplenMedidas() == false)
                todosCumplen = false;
            cont++;
        }
        return todosCumplen;
    }
    
    public int[] getDatosVehiculo(int id)
    {
        int [] datos;
        datos = new int[id];
        datos = new int [list[id].getAnt()];
        datos = new int [list[id].getKilometraje()];
        datos = new int [list[id].getDatoInteres()];
        return datos;
    }
}
