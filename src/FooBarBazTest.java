import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        String actualResult = fbb.transform(3);
        assertEquals("foo", actualResult);
    }
    
    @Test
    void testTranformWhenDivisibleBy5() {
        String actualResult = fbb.transform(5);
        assertEquals("bar", actualResult);
    }
    
    @Test
    void testTranformWhenDivisibleBy7() {
        String actualResult = fbb.transform(7);
        assertEquals("baz", actualResult);
    }
    
    @Test 
    void testTransformWhenDivisibleByAll() {
        String actualResult = fbb.transform(105);
        assertEquals("foobarbaz", actualResult);
    }
    
    @Test 
    void testTransformWhenDivisibleBy3And5() {
        String actualResult = fbb.transform(15);
        assertEquals("foobar", actualResult);
    }
    
    @Test 
    void testTransformWhenDivisibleBy5And7() {
        String actualResult = fbb.transform(35);
        assertEquals("barbaz", actualResult);
    }
    
    @Test 
    void testTransformWhenDivisibleBy3And7() {
        String actualResult = fbb.transform(21);
        assertEquals("foobaz", actualResult);
    }
    
    @Test
    void testBatch() throws IOException {
        fbb.processBatch();
        String input = Files.readString(Paths.get("src/resources/fbb-expected-output.txt"), StandardCharsets.US_ASCII);
        String output = Files.readString(Paths.get("src/resources/fbb-actual-output.txt"), StandardCharsets.US_ASCII);
        assertEquals(input,output);
    }
    
    @Test 
    void testConsole() {
        fbb.processConsole();
    }
    
    @Test
    void testMain() throws Exception {
        fbb.main(null);
    }

}
