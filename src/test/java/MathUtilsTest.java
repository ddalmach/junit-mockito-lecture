import io.javadev.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setup(){
        System.out.println("This is executed before every test");
        mathUtils = new MathUtils();
    }

    @Test
    void shouldReturnTheResultTwoWhenAddingTwoNumbers(){
        Assertions.assertEquals(2, mathUtils.add(1,1));
    }

    @Test
    void shouldReturnTheResultThreeWhenSubstractingTwoNumbers(){
        Assertions.assertEquals(3, mathUtils.substract(6,3));
    }
}
