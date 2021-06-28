package main.command;

// COMMAND
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        // since we have a turn on execution command
        // the undo of this command is light off
        light.off();
    }
}
