import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test07_ParameterizedTest {
    @Test
    void testLength(){
        assertTrue("Mesut".length()>0);
        assertTrue("Yakup".length()>0);
        assertTrue("Onur".length()>0);
        assertTrue("Emre".length()>0);
        assertTrue("Irmak".length()>0);
        assertTrue("Cihan".length()>0);
        assertTrue("Event".length()>0);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Mesut","Yakup","Onur","Emre","Irmak","Cihan","Sefa"})
    void testLength2(String a){
        assertTrue(a.length()>0);
    }
    //-------------------------------------------------------
    @Test
    void testToUpperCase(){
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }
    @ParameterizedTest
    @CsvSource(value = {
           "MERHABA, Merhaba",
           "JAVA,Java",
           "TEST,Test"
    })
    void testUpperCase(String str1, String str2){
        assertEquals(str1,str2.toUpperCase());
    }
    //--------------------------
    /*
    java    --> a   ----> assertTrue(contains)
    junit   --> u   ----> assertTrue(contains)
    hello   --> a   ----> assertFalse(contains)
    */
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,junit,u","false,hello,a"})
    void testContains(boolean b, String str1, String str2){
        assertEquals(b,str1.contains(str2));
    }
}
