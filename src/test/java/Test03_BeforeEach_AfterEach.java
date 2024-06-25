import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {
    String str;
    @BeforeEach
    void beforeEach(){
        str = "Junit ile test";
        System.out.println("beforeEach() çalıştı");
    }
    @AfterEach
    void afterEach(){
        str ="";
        System.out.println("afterEach() çalıştı");

    }
    @Test
    void testArrays(TestInfo info){
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Junit","ile","test"};
        System.out.println(info.getDisplayName()+" çalıştı");
        assertTrue(Arrays.equals(actualArray,expectedArray));
    }

    @Test
    void testLength(TestInfo info){
        String str = "Merhaba Dünya";
        int actual = str.length();
        int expected = 13;
        System.out.println(info.getTestClass()+"çalıştı");
        assertEquals(actual,expected);
    }

}
