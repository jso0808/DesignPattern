package command;

/*
    invoker
    - 커맨드 객체들을 저장하고, 버튼이 눌릴 때 해당 커맨드를 실행한다.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("=============== 리모컨 ================");
//        stringBuilder.append("\n");
//        for(int i=0; i<7; i++) {
//            stringBuilder.append("[").append(i).append("번 slot]")
//                    .append(onCommands[i].getClass().getName())
//                    .append("  ")
//                    .append(offCommands[i].getClass().getName()).append("\n");
//        }
//        return stringBuilder.toString();
//    }

}
