package command.Stereo;

public class Stereo {

    int volume;

    public Stereo(int volume) {
        this.volume = volume;
    }

    public void on() {
        System.out.println("Stereo on");
    }
    public void off() {
        System.out.println("Stereo off");
    }


    public void setCD(){
        System.out.println("Stereo set CD");
    }

    public void setVolume(int volume){
        System.out.println("Stereo set volume -> "+volume);
    }

    public int getVolume() {
        return volume;
    }
}
