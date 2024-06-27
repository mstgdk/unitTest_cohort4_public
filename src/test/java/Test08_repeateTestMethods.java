import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test08_repeateTestMethods {

    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("ka","Patika".substring(4));
    }
}
