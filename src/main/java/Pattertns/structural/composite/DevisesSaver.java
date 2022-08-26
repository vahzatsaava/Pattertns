package Pattertns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DevisesSaver {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void create() {
        for (var device : devices) {
            device.showDisplay();
        }
    }
}
