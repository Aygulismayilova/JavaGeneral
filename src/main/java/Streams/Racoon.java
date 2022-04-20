package Streams;

public class Racoon extends Animal {
    private int cheetosEaten;
    private int chunkiness;//1-10

    public Racoon(String name, double health, int cheetosEaten, int chunkiness) {
        super(name, health);
        this.cheetosEaten = cheetosEaten;
        this.chunkiness = chunkiness;
    }

    public int getCheetosEaten() {
        return cheetosEaten;
    }

    public void setCheetosEaten(int cheetosEaten) {
        this.cheetosEaten = cheetosEaten;
    }

    public int getChunkiness() {
        return chunkiness;
    }

    public void setChunkiness(int chunkiness) {
        this.chunkiness = chunkiness;
    }
}
