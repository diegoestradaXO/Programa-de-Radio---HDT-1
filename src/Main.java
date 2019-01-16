public class Main {
    public static void main (String[] args) {
        //Test
        CarRadio myRadio = new CarRadio();
        System.out.println(myRadio);
        myRadio.toggle();
        System.out.println(myRadio);
        myRadio.changeStation(true);
        System.out.println(myRadio);
        myRadio.changeStation(false);
        System.out.println(myRadio);
        myRadio.changeFrequency();
        System.out.println(myRadio);
        myRadio.saveStation(1);
        myRadio.changeStation(true);
        myRadio.changeStation(true);
        myRadio.changeStation(true);
        System.out.println(myRadio);
        myRadio.changeStationButton(1);
        System.out.println(myRadio);
        ;

    }
}
