public abstract class Shape {       //Clasa de baza
    private double area;            //encapsulation

    public Shape() {
    }

    public double getArea() {
        return area;
    }

    public void onAreaChange(double area){
        this.area=area;
    }
}
