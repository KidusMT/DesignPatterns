package main.command;

public interface Command {
    // for executing any command
    void execute();

    // for going back to the previous command
    void undo();
}
