package command.Stereo;

import command.Command;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(stereo.getVolume());
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
