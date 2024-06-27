import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test06_TestingExceptions {
    @Test
   public void testException(){
        int a = 2;
        int b = 0;

        assertThrows(RuntimeException.class, ()->
                System.out.println(a/b));
    }
}
