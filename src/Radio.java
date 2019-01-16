/*
 *Esta interface sera implementada en distintas clases de radio, contiene las funciones basicas.
 */
public interface Radio {
    //Cambia de encendido a apagado
    public void toggle();
    //Devuelve si esta encendido o apagado
    public boolean getState();
    //Cambia de AM a FM y viceversa
    public void changeFrequency();
    //Aumenta o disminuye la estacion, el parametro sup determina si sube(true) o si baja(false) de estacion
    public void changeStation(boolean up);

    public boolean getFrequency();

    public void saveStation(int numButton);

    public void changeStationButton(int numButton);

    public double getStation();



}
