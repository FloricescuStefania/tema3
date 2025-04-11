package appliances;

public class Appliance {

    private String name;

    Appliance(String name) {
        this.name = name;
    }

    public void connect(ExtensionCord extensionCord) {
        extensionCord.connectAppliance(this);
    }

    public void disconnect(ExtensionCord extensionCord) {
        extensionCord.disconnectAppliance(this);
    }

    public void update(boolean status) {
        if(status) {
            System.out.println(this.name + " has been connected to the power.");
        } else {
            System.out.println(this.name + " has been disconnected from the power.");
        }
    }
}