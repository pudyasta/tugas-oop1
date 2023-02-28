package pudy.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LuasTest {
    @Test
    void luasTest(){
        double ling1 = new Circle(4).getLuas();
        double ling2 = new Circle(7.5).getLuas();
        double ling3 = new Circle(5).getLuas();
        double ling4 = new Circle(10).getLuas();
        int kotak = new Rectangle(35,30).getLuas();
        double luasArsir = kotak - (ling1+ling2+ling3+ling4);
        System.out.println(luasArsir);
    }
}
