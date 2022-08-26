package Pattertns.behavior.template_method;

public abstract class HouseBuilding {
    public final void createHouse() {
        createFundament();
        createDoorAndWindow();
        useMaterials();
        createRoof();
    }

    private void createFundament() {
        System.out.println("Create fundament ");
    }

    public abstract void createDoorAndWindow();

    public abstract void useMaterials();

    private void createRoof() {
        System.out.println("Create roof");
    }
}
