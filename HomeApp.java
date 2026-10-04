// Client: only talks to HomeInterface, never to the individual services.
public class HomeApp {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();

        System.out.println("=== Individual controls ===");
        home.turnOnLight();
        home.turnOnTV();
        home.turnOffTV();
        home.turnOnAirConditioning();
        home.turnOffAirConditioning();
        home.turnOffLight();

        System.out.println();
        home.turnOnAll();
        System.out.println();
        home.turnOffAll();
    }
}