import io.javadev.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void shouldReturnTheResultTwoWhenAddingTwoNumbers(){
        MathUtils mathUtils = new MathUtils();
        Assertions.assertEquals(2, mathUtils.add(1,1));
    }

    @Test
    void shouldReturnTheResultThreeWhenSubstractingTwoNumbers(){
        MathUtils mathUtils = new MathUtils();
        Assertions.assertEquals(3, mathUtils.substract(6,3));
    }
}
