/**
 * Este es el main del radio, donde puede verse su funcionamiento. 
 * @ Diego Estrada e Isabel Ortiz
 */
import java.util.Scanner;
public class Main {
    /**
     * Este es el metodo principal 
     * @param args argumentos del main 
     */
    public static void main (String[] args) {
        Radio r = new MyRadio();
        boolean wantsToContinue = true;
        do {
            if (r.getState() == false) {
                System.out.println(r);
               
                //Se crea el menu con las diferentes opciones. 
                System.out.println("-----Menu-----\n" +
                        "1.Power On/Off\n" +
                        "2.Cambiar de frecuencia\n" +
                        "3.Cambiar de estacion\n" +
                        "4.Guardar estacion en boton\n" +
                        "5.Seleccionar estacion en boton\n" +
                        "6.Salir del programa");
                //Se le pide al usuario que escoja una opcion de la radio. 
                System.out.println("\nEscoja una opcion:");
                @SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
                int option = input.nextInt();
                //Si el usuario escoje la opcion 1 se enciende la radio 
                if (option == 1) {
                    System.out.println("Encendiendo radio...");
                    r.toggle();
                } else if(option == 6){
                    wantsToContinue = false;
                } else {
                    System.out.println("El radio esta apagado, enciendelo antes...");
                }
            } else {
                System.out.println(r);
                System.out.println("-----Menu-----\n" +
                        "1.Power On/Off\n" +
                        "2.Cambiar de frecuencia\n" +
                        "3.Cambiar de estacion\n" +
                        "4.Guardar estacion en boton\n" +
                        "5.Seleccionar estacion en boton\n" +
                        "6.Salir del programa");
                System.out.println("\nEscoja una opcion:");
                @SuppressWarnings("resource")
				Scanner inputON = new Scanner(System.in);
                int optionON = inputON.nextInt();
              //Si el usuario escoje la opcion 1, se ejecuta el metodo toggle
                if (optionON == 1){
                    r.toggle();
              //Si el usuario escoje la opcion 2, se ejecuta el metodo para cambiar frecuencia 
                }else if(optionON == 2){
                    r.changeFrequency();
              ////Si el usuario escoje la opcion 3, se ejecuta el metodo para cambiar estaciones
                }else if (optionON == 3){
                    System.out.println("1.Subir\n2.Bajar\n>Seleccione opcion:");
                    @SuppressWarnings("resource")
					Scanner upOrDown = new Scanner(System.in);
                    int upOrDownInt = upOrDown.nextInt();
                    //Si el usuario escoje opcion 1, la estacion sube
                    if (upOrDownInt == 1) {
                        r.changeStation(true);
                    }
                    //Si el usuario escoje opcion 1, la estacion baja
                    if (upOrDownInt == 2) {
                        r.changeStation(false);
                    }
                    
                // Si el usuario escoje la opcion 4, se guarda la estacion en un boton enumerado del 1 a 12. 
                }else if (optionON == 4){
                    System.out.println("Escriba el numero de boton en el que desea guardar la actual estacion (1-12): ");
                    @SuppressWarnings("resource")
					Scanner saveButtonInput = new Scanner(System.in);
                    int saveButtonInt = saveButtonInput.nextInt();
                    if (saveButtonInt < 13 && saveButtonInt > 0) {
                        r.saveStation(saveButtonInt);
                    } else {
                        System.out.println("Invalido, ingresa un numero entre 1 y 12");
                    }
                // Si el usuario escoje la opcion 5, puede seleccionar alguna estacion con los botones. 
                }else if (optionON == 5){
                    System.out.println("Escriba el numero de boton con la estacion que desea sintonizar (1-12): ");
                    @SuppressWarnings("resource")
					Scanner changeStationButtonInput = new Scanner(System.in);
                    int changeStationButtonInt = changeStationButtonInput.nextInt();
                    @SuppressWarnings("unused")
					double oldStation = r.getStation();
                    @SuppressWarnings("unused")
					boolean oldFrequency = r.getFrequency();
                    if (changeStationButtonInt < 13 && changeStationButtonInt > 0) {
                        r.changeStationButton(changeStationButtonInt);
                        if (r.getStation() == 0.0){
                            r.changeFrequency();
                        }
                    } else {
                        System.out.println("Invalido, ingresa un numero entre 1 y 12");
                    }
                }else if (optionON == 6){
                    wantsToContinue = false;
                    break;
                }else{
                    System.out.println("Invalido...");
                }

            }

        }while(wantsToContinue);
     }
}