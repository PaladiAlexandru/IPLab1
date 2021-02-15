public class Cerc extends Shape implements Spune{
    private double radius;
    private double PI;

    public Cerc() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void spuneCeva(){
        System.out.println("Sunt in Cerc!");
    }
}
