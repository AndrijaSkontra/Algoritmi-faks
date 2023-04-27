package predavanja.predavanja26_4ur;

import predavanja.predavanja26_4.ArrayStackImplementation;
import predavanja.predavanja26_4.STACK;

public class TestUR {

    public static void main(String[] args) {
        CommandCLS cmd1 = new CommandCLS("write text.");
        CommandCLS cmd2 = new CommandCLS("delete part of text.");
        CommandCLS cmd3 = new CommandCLS("calculate something.");
        ArrayStackImplementation<CommandCLS> undoStack = new ArrayStackImplementation<>(10);
        STACK<CommandCLS> redoStack = new ArrayStackImplementation<>(10);
        undoStack.push(cmd1);
        undoStack.push(cmd2);
        undoStack.push(cmd3);
        System.out.println("Undo stack: ");
        System.out.println(undoStack);

        System.out.println("Redo stack: ");
        redoStack.push(undoStack.pop());
        redoStack.push(undoStack.pop());
        redoStack.push(undoStack.pop());
        System.out.println(redoStack);
        System.out.println("radi");
    }

}
