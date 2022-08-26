package Pattertns.behavior.memento;

public class TextWindow {
    private StringBuilder currentText;

    public StringBuilder getCurrentText() {
        return currentText;
    }

    public TextWindow(StringBuilder currentText) {
        this.currentText = currentText;
    }

    public void addText(String message) {
        currentText.append(message);
    }

    public TextWindowState save(){
        return new TextWindowState(currentText.toString());
    }
    public void restore(TextWindowState state){
        this.currentText = new StringBuilder(state.getText());
    }
}
