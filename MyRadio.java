/**
 * Esta es la clase donde se puede observar el funcionamiento de los metodos. 
 * 
 * @author Diego estrada e Isabel Ortiz Naranjo 
 *
 */
/**
 * Clase principal
 * @author Diego estrada e Isabel Ortiz Naranjo 
 *
 */
public class MyRadio implements Radio {
    private double station;
    private boolean isFM;
    private boolean isTurnedOn;
    private double[] buttons;


    //Valores constantes

    public static final double INITIAL_STATION_FM = 87.9;
    public static final double FINAL_STATION_FM = 107.9;

    public static final double INITIAL_STATION_AM = 530.0;
    public static final double FINAL_STATION_AM = 1610.0;

    public static final double AM_STATION_STEP = 10.0;
    public static final double FM_STATION_STEP = 0.2;

    //Constructor
    public MyRadio(){
        this.isFM = true;
        this.isTurnedOn = false;
        this.station = INITIAL_STATION_FM;
        this.buttons = new double[12];
    }

    //Cambia de encendido a apagado
    @Override
    public void toggle(){
        this.isTurnedOn = !this.isTurnedOn;
    }
    //Devuelve si esta encendido o apagado
    @Override
    public boolean getState(){
        return this.isTurnedOn;
    };
    //Cambia de AM a FM y viceversa
    @Override
    public void changeFrequency(){
        if (this.isFM){
            this.isFM = !this.isFM;
            this.station = INITIAL_STATION_AM;
        }else{
            this.isFM = !this.isFM;
            this.station = INITIAL_STATION_FM;
        }
    };
    //Aumenta o disminuye la estacion, el parametro sup determina si sube(true) o si baja(false) de estacion
    @Override
    public void changeStation(boolean up){
        if(up){
            if (isFM){
                this.station += FM_STATION_STEP;
                if (this.station > FINAL_STATION_FM){
                    this.station = INITIAL_STATION_FM;
                }
            }else{
                this.station += AM_STATION_STEP;
                if (this.station > FINAL_STATION_AM){
                    this.station = INITIAL_STATION_AM;
                }
            }
        }else{
            if (isFM){
                this.station -= FM_STATION_STEP;
                if (this.station < INITIAL_STATION_FM){
                    this.station = FINAL_STATION_FM;
                }
            }else{
                this.station -= AM_STATION_STEP;
                if (this.station < INITIAL_STATION_AM){
                    this.station = FINAL_STATION_AM;
                }
            }

        }
    };
    @Override
    public boolean getFrequency(){
        return this.isFM;
    };
    @Override
    public void saveStation(int numButton){
        buttons[numButton-1] = this.station;
        //buttons.set(numButton-1,this.station);
    };
    @Override
    public void changeStationButton(int numButton){
        this.station = buttons[numButton-1];
        if (this.station > INITIAL_STATION_FM && this.station < FINAL_STATION_FM){
            this.isFM = true;
        }else{
            this.isFM = false;
        }
    };
    @Override
    public double getStation(){
        return this.station;
    };
    @Override
    public String toString() {
        return "Radio{" +
                "isTurnedOn=" + isTurnedOn +
                ", isInFM=" + isFM +
                ", station=" + station +
                '}';
    }
}

