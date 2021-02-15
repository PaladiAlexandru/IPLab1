public class Main {
    public static void main(String[] args) {
        Cerc cerc1 = new Cerc();
        cerc1.setRadius(200);
        cerc1.onAreaChange(150);
        System.out.println("Area cerc: " + cerc1.getArea());

        Patrat patrat1 = new Patrat();
        patrat1.setHeight(100);
        patrat1.setWidth(100);
        patrat1.onAreaChange(50);
        System.out.println("Area patrat: " + patrat1.getArea());

        Triunghi triunghi1 = new Triunghi();
        triunghi1.setHeight(60);
        triunghi1.setBase(70);
        triunghi1.onAreaChange(20);
        System.out.println("Area triunghi: "+ triunghi1.getArea());


        triunghi1.spuneCeva();      //polimorfism
        patrat1.spuneCeva();        //polimorfism
        cerc1.spuneCeva();          //polimorfism

    }
}
