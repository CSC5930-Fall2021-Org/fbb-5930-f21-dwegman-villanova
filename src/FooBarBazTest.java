import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FooBarBazTest {

    /*private FooBarBaz fbb;
    
    //@BeforeEach
    void setup() {
        this.fbb = new FooBarBaz();
    }*/

    @Test
    void testTranformWhenDivisibleBy3() {
        FooBarBaz fbb = new FooBarBaz();
        String actualResult = fbb.transform(3);
        //expected, actual
        assertEquals("foo", actualResult);
    }

}
