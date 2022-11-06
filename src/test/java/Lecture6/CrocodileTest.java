package Lecture6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CrocodileTest {

    Crocodile crocodileTest = new Crocodile();

    @BeforeEach
    public void setUp(){
        crocodileTest.setColor("Green");
        crocodileTest.setName("Gena");
        crocodileTest.setSize(150);
        crocodileTest.setHungry(true);

    }
    @AfterEach
    public void tearDown() {
        crocodileTest = null;
    }


     @Test
     public void firstTest(){
         assertThat(crocodileTest.getColor()).isEqualTo("Green");
         assertThat(crocodileTest.getName()).isEqualTo("Gena");
         assertThat(crocodileTest.getSize()).isEqualTo(150);
         assertThat(crocodileTest.isHungry()).isEqualTo(true);
         assertThat(crocodileTest.isHungry()).isTrue();

         System.out.println(crocodileTest.getColor());
         System.out.println(crocodileTest.getName());
         System.out.println(crocodileTest.getSize());
         System.out.println(crocodileTest.isHungry());

    }
}

