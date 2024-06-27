import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAll_AfterAll {
static String str;
    @BeforeAll
   static void beforeAll(){
        str = "junit ile test";
        System.out.println("beforeAll() çalıştı");
    }
    @AfterAll
    static void afterAll(){
        str = "";
        System.out.println("afterAll() çalıştı");
    }

    @Test
    void testArrays(TestInfo info){
        String[] actualarr = str.split(" ");
        String[] expectedArr = {"junit","ile","test"};

        assertArrayEquals(actualarr,expectedArr,"diziler birbirinden farklı");

    }
    @Test
    void testArrays2(TestInfo info){
        String[] actualarr = str.split(" ");
        String[] expectedArr = {"junit","ile","test"};

        assertArrayEquals(actualarr,expectedArr,"diziler birbirinden farklı");

    }

}
