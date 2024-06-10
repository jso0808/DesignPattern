package command.light;

/*
    receiver
 */
public class Light {

    String targetName;

    public Light(String targetName) {
        this.targetName = targetName;
    }

    public void on(){
        System.out.println(targetName + " Light on!");
    }

    public void off(){
        System.out.println(targetName + " Light off!");
    }
}
