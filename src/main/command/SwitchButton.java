package main.command;

// INVOKER: the mediator between the client and the receiver
public class SwitchButton {

    // uses the command with composition dependency
    Command command;

    public SwitchButton() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        this.command.execute();
    }

    public void buttonPressedUndo() {
        this.command.undo();
    }
}
