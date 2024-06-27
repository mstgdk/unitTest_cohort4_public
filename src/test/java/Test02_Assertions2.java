import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions2 {


    @Test
    void testMin(){
        assertEquals(3,Math.min(14,3));
    }

    @Test
    void testArrays(){
        String str = "Junit patika dev";
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Junit","patika","dev","a"};

        assertTrue(Arrays.equals(actualArray,expectedArray));
         //assertFalse(Arrays.equals(actualArray,expectedArray));
    }

}
