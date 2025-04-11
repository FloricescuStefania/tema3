package appliances;

import java.util.ArrayList;
import java.util.List;

public class ExtensionCord {
    private List<Appliance> appliances = new ArrayList<>();
    private boolean isConnected;

    public void connectAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public void disconnectAppliance(Appliance appliance) {
        appliances.remove(appliance);
    }

    public void connectToElectricity() {
        isConnected = true;
        notifyAppliances();
    }

    public void disconnectFromElectricity() {
        isConnected = false;
        notifyAppliances();
    }

    public void notifyAppliances() {
        for(Appliance app : appliances) {
            app.update(this.isConnected);
        }
    }
}