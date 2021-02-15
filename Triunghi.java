public class Triunghi extends Shape implements Spune{
    private double height;
    private double base;

    public Triunghi() {
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public void spuneCeva(){
        System.out.println("Sunt in Triunghi!");
    }
}
