package main.command;

public class RemoteControlTest {

    public static void main(String[] args) {

        // The switch button is the invoker of the command. Therefore all things like button click are executed with it
        SwitchButton switchButton = new SwitchButton();
        // the device
        Light light = new Light();
        // defining the command to be executed and passing the device on which the command is going ot be execute
        LightOnCommand lightONCommand = new LightOnCommand(light);
        // setting the command to be executed.. we can change to a lightOffCommand if we want to turn it of
        switchButton.setCommand(lightONCommand);
        // pressing the button with a button click for execute
        switchButton.buttonPressed();
        // pressing the button with a button click for UNDO
        switchButton.buttonPressedUndo();
    }
}
