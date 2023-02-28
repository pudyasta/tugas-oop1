package pudy.app;

public class Circle {
    private double jari;

    public Circle(double jari) {
        this.jari = jari;
    }


    public double getLuas(){
        return 3.14*jari*jari;
    }
    public double getKeliling(){
        return 3.14*jari*2;
    }
}
