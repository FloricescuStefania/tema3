package appliances;

/* Mai multe aparate electrice sunt conectate la un prelungitor. Când prelungitorul este băgat
sau scos din priză toate aparatele conectate trebuie să dea un mesaj corespunzător
(Ex: aparatul de cafea a fost conectat la curent, frigiderul a fost deconectat de la curent). */
// OBSERVER PATTERN

public class Main {
    public static void main(String[] args) {

        ExtensionCord extensionCord = new ExtensionCord();
        Appliance appliance1 = new Appliance("Refrigerator");
        Appliance appliance2 = new Appliance("TV");
        Appliance appliance3 = new Appliance("Phone");
        appliance1.connect(extensionCord);
        appliance2.connect(extensionCord);
        appliance3.connect(extensionCord);

        extensionCord.connectToElectricity();
        extensionCord.disconnectFromElectricity();
    }
}