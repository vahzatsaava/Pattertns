package Pattertns.creational_patterns.builder;

public class BuilderStringExample {
    private String text;
    private String name;
    private String age;

    private BuilderStringExample(DemoBuilder demoBuilder) {
        this.text = demoBuilder.text;
        this.age = demoBuilder.age;
        this.name = demoBuilder.name;
    }

    public String getText() {
        return text;
    }

    public static class DemoBuilder{
        private String text;
        private String name;
        private String age;

        public DemoBuilder(String text, String name, String age) {
            this.text = text;
            this.name = name;
            this.age = age;
        }

        public DemoBuilder setName (String name){
            this.name = name;
            return this;
        }
        public DemoBuilder setAge (String age){
            this.age = age;
            return this;
        }

        public BuilderStringExample build(){
            return new BuilderStringExample(this);
        }
    }
}
