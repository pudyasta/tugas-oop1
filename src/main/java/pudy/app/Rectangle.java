package pudy.app;

public class Rectangle {
    private int panjang;
    private int lebar;

    public Rectangle(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getLuas(){
        return  panjang*lebar;
    }

    public  int getKeliling(){
        return 2*(panjang+lebar);
    }
}
