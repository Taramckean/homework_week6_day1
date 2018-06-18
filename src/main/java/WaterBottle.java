public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    };

    public int drink() {
       return volume -= 10;
    }

    public int empty() {
        return volume = 0;
    }

    public int fill() {
        return volume = 100;
    }
}
