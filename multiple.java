interface Light {
    void turnOn();
}

interface WiFi {
    void connectWiFi();
}

class SmartLight implements Light, WiFi {

    public void turnOn() {
        System.out.println("Smart Light is ON");
    }

    public void connectWiFi() {
        System.out.println("WiFi Connected");
    }

    void displayDevice() {
        System.out.println("Device: Smart Light");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {

        SmartLight s = new SmartLight();

        s.displayDevice();
        s.turnOn();
        s.connectWiFi();
    }
}