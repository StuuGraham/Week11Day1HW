public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drinkWater() {
        this.volume -= 10;
        return this.volume;
    }

    public int emptyBottle() {
        this.volume = 0;
        return this.volume;
    }

    public int fillBottle() {
        this.volume += 100;
        return this.volume;
    }
}
