package Pattertns.creational_patterns.builder;

public class RunnerBuilder {
    public static void main(String[] args) {
        BuilderStringExample builderStringExample = new BuilderStringExample.DemoBuilder("reer","fff","44").setAge("33").setName("ferry").build();
        System.out.println(builderStringExample.getText());
    }
}
