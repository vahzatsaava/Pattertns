package Pattertns.behavior.template_method;

public class BigHouse extends HouseBuilding{
    @Override
    public void createDoorAndWindow() {
        System.out.println("10 Doors and 50 windows");
    }

    @Override
    public void useMaterials() {
        System.out.println("Use concrete");
    }
}
