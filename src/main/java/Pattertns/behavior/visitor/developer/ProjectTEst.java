package Pattertns.behavior.visitor.developer;

public class ProjectTEst implements ProjectElement {
    private ProjectElement[] elements;

    public ProjectTEst() {
        this.elements = new ProjectElement[]{
                new Database(),
                new ClassJava(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement projectElement : elements) {
            projectElement.beWritten(developer);
        }
    }
}
