import io.javadev.MathUtils;
import org.junit.jupiter.api.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeAll
    static void firstSetup(){
        System.out.println("This is execute before the test class initialization ");
    }

    @BeforeEach
    void setup(){
        System.out.println("This is executed before every test");
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanUp(){
        System.out.println("This is executed after every test");
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
