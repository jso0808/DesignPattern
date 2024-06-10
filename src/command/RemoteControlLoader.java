package command;

import command.GarageDoor.GarageDoorCloseCommand;
import command.GarageDoor.GarageDoor;
import command.GarageDoor.GarageDoorOpenCommand;
import command.Stereo.Stereo;
import command.Stereo.StereoOffWithCDCommand;
import command.Stereo.StereoOnWithCDCommand;
import command.light.Light;
import command.light.LightOffCommand;
import command.light.LightOnCommand;

public class RemoteControlLoader {

    public static void main(String[] args) {
        RemoteControl remoCon = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo(10);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoCon.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoCon.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoCon.setCommand(2, garageDoorOpen, garageDoorClose);
        remoCon.setCommand(3, stereoOnWithCD, stereoOffWithCD);


        remoCon.onButtonWasPushed(0); // livingRoomLightOn
        remoCon.onButtonWasPushed(1); // kitchenLightOn
        remoCon.offButtonWasPushed(1); // kitchenLightOff
        remoCon.undoButtonWasPushed();    // kitchenLightOff undo -> kitchenLightOn
//        remoCon.onButtonWasPushed(1);
//        remoCon.onButtonWasPushed(2);
//        remoCon.undoButtonWasPushed();
//        remoCon.onButtonWasPushed(3);
//        remoCon.offButtonWasPushed(3);
//        remoCon.undoButtonWasPushed();
    }
}


