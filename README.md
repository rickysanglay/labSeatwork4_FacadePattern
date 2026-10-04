# Simplified Intelligent Home System (Facade Pattern)

## Problem Statement
The HomeApp needs to manage various home services for an intelligent home system. These services include turning on and off the lights, TV, and air conditioning. However, the HomeApp aims to interact with these services through a simplified, single interface provided by the HomeInterface. The HomeInterface class should delegate the user's requests to the appropriate service classes (Light, TV, AirConditioning) while abstracting the service details from the user. Additionally, the HomeInterface should provide methods to turn on all services (`turnOnAll()`) and turn off all services (`turnOffAll()`).

### Class Definitions
- **HomeService (Interface):** Defines the common interface for all home services.
- **Light:** A service class implementing HomeService, responsible for turning the lights on and off. Includes `turnOn()` and `turnOff()`.
- **TV:** A service class implementing HomeService, responsible for turning the TV on and off. Includes `turnOn()` and `turnOff()`.
- **AirConditioning:** A service class implementing HomeService, responsible for turning the air conditioning on and off. Includes `turnOn()` and `turnOff()`.
- **HomeInterface:** The facade class that coordinates interactions between the client (HomeApp) and the individual home services. Includes `turnOnAll()` and `turnOffAll()`.
- **HomeApp:** The client class that uses the HomeInterface to access and utilize home services seamlessly.

## How to Run
```
javac *.java
java HomeApp
```