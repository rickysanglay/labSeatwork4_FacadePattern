// Facade: gives the client one simple interface to all home services.
public class HomeInterface {
    private final Light light;
    private final TV tv;
    private final AirConditioning airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    // Individual service controls
    public void turnOnLight()  { light.turnOn(); }
    public void turnOffLight() { light.turnOff(); }

    public void turnOnTV()  { tv.turnOn(); }
    public void turnOffTV() { tv.turnOff(); }

    public void turnOnAirConditioning()  { airConditioning.turnOn(); }
    public void turnOffAirConditioning() { airConditioning.turnOff(); }

    // Control all services at once
    public void turnOnAll() {
        System.out.println("--- Turning ON all services ---");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("--- Turning OFF all services ---");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}