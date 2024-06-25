import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {
    @Test
    public void test(){

    }

    @Test
    void testLength(){
        String str = "Merhaba Dünya";
        int actual = str.length();
        int expected = 13;

        assertEquals(actual,expected);
    }

    @Test
    void testUpperCase(){
        String actual = "Hello".toUpperCase();
        String expected = "HELLO";

        assertEquals(actual,expected,"Testten geçemedi");
    }

    @Test
    void testToplama(){
        int a = 15;
        int b = 12;
        int actual = Math.addExact(a,b);
        int expected = 27;

        assertEquals(actual,expected);
    }
    @Test
    void testContains(){
        assertEquals(false,"Mesut".contains("a"));
    }
}
