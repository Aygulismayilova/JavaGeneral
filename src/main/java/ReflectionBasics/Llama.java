package ReflectionBasics;

public class Llama {
    private String name;
    private int eyeCount;
    private String color;
    private boolean isAlive;

    public Llama(String name, int eyeCount, String color, boolean isAlive) {
        this.name = name;
        this.eyeCount = eyeCount;
        this.color = color;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Llama{" +
                "name='" + name + '\'' +
                ", eyeCount=" + eyeCount +
                ", color='" + color + '\'' +
                ", isAlive=" + isAlive +
                ", alive=" + isAlive() +
                '}';
    }

    public void spit(){
        System.out.println("*spit*");

    }
    private void fart(){
        System.out.println("*fart*");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyeCount() {
        return eyeCount;
    }

    public void setEyeCount(int eyeCount) {
        this.eyeCount = eyeCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

}
