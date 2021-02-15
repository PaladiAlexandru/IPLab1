public class Patrat extends Shape implements Spune{
    private double height;
    private double width;

    public Patrat() {
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void spuneCeva(){
        System.out.println("Sunt in Patrat!");
    }

}
