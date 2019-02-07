package sharpie;

public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width){
        this.color = color;
        this.width = width;

        inkAmount = 0;
    }
    public void use(){
        inkAmount -=1;
    }

    public double getInkAmount() {
        return this.inkAmount;
    }
}
