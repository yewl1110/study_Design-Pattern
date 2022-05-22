import command.*;
import invoker.RemoteControl;
import receiver.CeilingFan;
import receiver.GarageDoor;
import receiver.Light;
import receiver.Stereo;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("LivingRoom");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("LivingRoom");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOnCommand garageDoorOn = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOff = new GarageDoorOffCommand(garageDoor);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        Command[] macroOn = {livingRoomLightOn, kitchenLightOn, ceilingFanOn, stereoOn};
        Command[] macroOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, stereoOff};

        MacroCommand switchOnMacro = new MacroCommand(macroOn);
        MacroCommand switchOffMacro = new MacroCommand(macroOff);

        remoteControl.setCommand(0, switchOnMacro, switchOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- macro on ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- macro off ---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- macro undo ---");
        remoteControl.undoButtonWasPushed();
    }
}
