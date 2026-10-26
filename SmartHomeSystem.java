interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan turned ON");
    }

    public void turnOff() {
        System.out.println("Fan turned OFF");
    }
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}

class SmartAC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC turned ON");
    }

    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartDevice device;

        device = new SmartFan();
        device.turnOn();
        device.turnOff();

        device = new SmartLight();
        device.turnOn();
        device.turnOff();

        device = new SmartAC();
        device.turnOn();
        device.turnOff();
    }
}
