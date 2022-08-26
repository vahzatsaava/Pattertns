package Pattertns.behavior.memento;

public class MementoTest {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new TextWindow(new StringBuilder()));
        editor.write("Hello dear friends");
        editor.write("Weeee");
        editor.hitSave();
        System.out.println(editor);
        editor.write("fdgfgdfgdfg");
        System.out.println(editor);
        editor.hitUndo();
        System.out.println(editor);
    }
}
