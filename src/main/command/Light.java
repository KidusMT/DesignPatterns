package main.command;

public class Light {
    // for this scenario we have only two modes(states) but we can have multiple
    // like for example:
    //     - high
    //     - medium
    //     - low
    public void on(){
        System.out.println("Light: turn on");
    }
    public void off(){
        System.out.println("Light: turn off");
    }
}
