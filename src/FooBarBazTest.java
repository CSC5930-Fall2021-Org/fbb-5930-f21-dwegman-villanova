import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FooBarBazTest {

    private FooBarBaz fbb;
    
    @BeforeEach
    void setup() {
        this.fbb = new FooBarBaz();
    }

    @Test
    void testTranformWhenDivisibleBy3() {
        //FooBarBaz fbb = new FooBarBaz();
        String actualResult = fbb.transform(3);
        //expected, actual
        assertEquals("foo", actualResult);
    }
    
    @Test
    void testTranformWhenDivisibleBy5() {
        //FooBarBaz fbb = new FooBarBaz();
        String actualResult = fbb.transform(5);
        //expected, actual
        assertEquals("bar", actualResult);
    }
    
    @Test
    void testTranformWhenDivisibleBy7() {
        //FooBarBaz fbb = new FooBarBaz();
        String actualResult = fbb.transform(7);
        //expected, actual
        assertEquals("baz", actualResult);
    }

}
