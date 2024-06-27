import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10_GroupingTests {
    @Nested
    class Group1{
        @Test
        void aaaa(){
            String str = "Merhaba Dünya";
            int actual = str.length();
            int expected = 13;

            assertEquals(actual,expected);
        }

        @RepeatedTest(3)
        void bbbbb(){
            String actual = "Hello".toUpperCase();
            String expected = "HELLO";

            assertEquals(actual,expected,"Testten geçemedi");
        }
    }

    @Nested
    class Group2{
        @Test
        void nnnnn(){
            String str = "Merhaba Dünya";
            int actual = str.length();
            int expected = 13;

            assertEquals(actual,expected);
        }

        @RepeatedTest(3)
        void pppppp(){
            String actual = "Hello".toUpperCase();
            String expected = "HELLO";

            assertEquals(actual,expected,"Testten geçemedi");
        }
    }
    @Nested
    class Group3{
        @Test
        void eeeee(){
            String str = "Merhaba Dünya";
            int actual = str.length();
            int expected = 13;

            assertEquals(actual,expected);
        }

        @RepeatedTest(3)
        void qqqqqqqq(){
            String actual = "Hello".toUpperCase();
            String expected = "HELLO";

            assertEquals(actual,expected,"Testten geçemedi");
        }
    }
}
