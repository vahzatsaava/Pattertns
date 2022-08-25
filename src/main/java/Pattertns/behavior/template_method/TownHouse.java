package Pattertns.behavior.template_method;

public class TownHouse extends HouseBuilding{
    @Override
    public void createDoorAndWindow() {
        System.out.println("Use only one Door and five windows");
    }

    @Override
    public void useMaterials() {
        System.out.println("use tree materials");
    }
}
