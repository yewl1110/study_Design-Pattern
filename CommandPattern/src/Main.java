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

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorOn, garageDoorOff);
        remoteControl.setCommand(4, stereoOn, stereoOff);


        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);


        RemoteControl ceilingFanController = new RemoteControl();
        CeilingFan ceilingFan1 = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan1);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan1);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan1);
        ceilingFanOff = new CeilingFanOffCommand(ceilingFan1);
        ceilingFanController.setCommand(0, ceilingFanHigh, ceilingFanOff);
        ceilingFanController.setCommand(1, ceilingFanMedium, ceilingFanOff);
        ceilingFanController.setCommand(2, ceilingFanLow, ceilingFanOff);

        ceilingFanController.onButtonWasPushed(0);
//        ceilingFanController.undoButtonWasPushed();
        ceilingFanController.onButtonWasPushed(1);
//        ceilingFanController.undoButtonWasPushed();
        System.out.println(ceilingFanController);
        ceilingFanController.onButtonWasPushed(2);
        System.out.println(ceilingFanController);
        ceilingFanController.undoButtonWasPushed();
        System.out.println(ceilingFanController);
        ceilingFanController.offButtonWasPushed(2);
        ceilingFanController.undoButtonWasPushed();
    }
}
