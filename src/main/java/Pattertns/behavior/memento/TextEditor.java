package Pattertns.behavior.memento;

public class TextEditor {
    private TextWindow textWindow;
    private TextWindowState state;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void hitSave() {
        this.state = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(state);
    }

    public void write(String message) {
        textWindow.addText(message);
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "textWindow=" + textWindow.getCurrentText() +
                '}';
    }
}
