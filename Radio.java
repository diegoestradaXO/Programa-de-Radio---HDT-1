/**
 * 
 * Esta es la interfaz, donde estan los metodos a utilizar. 
 * @author Isabel Ortiz y Diego Estrada. 
 *
 */
public interface Radio {

    /**
     * Enciende la radio.
     */
    public void toggle();

    /**
     * Cambia de AM a FM y viceversa
     * @return - retorna true o false 
     */
    public boolean getState();

    /**
     * Aumenta o disminuye la estacion, el parametro sup determina si sube(true) o si baja(false) de estacion
     */
    public void changeFrequency();

    /**
     * Frecuencia
     * @param  up - up
     *  
     */
    public void changeStation(boolean up);

    /**
     * @return - retorna la estacion 
     */
    public boolean getFrequency();

    /**
     * Guarda estaciones 
     * @param numButton - boton
     * 
     */
    public void saveStation(int numButton);

    /**
     * Cambia estaciones
     * @param numButton - boton
     */
    public void changeStationButton(int numButton);

    /**
     * @return - retorna la estacion 
     */
    public double getStation();

}
