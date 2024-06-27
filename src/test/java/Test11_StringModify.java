import com.patika.StringModify;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test11_StringModify {
    StringModify stringModify;
    @BeforeEach
    void start(){
        stringModify = new StringModify();
        System.out.println("@BeforeEach çalıştı");
    }
    @AfterEach
    void finish(){
        stringModify =null;
        System.out.println("@AfterEach çalıştı");
    }
    @ParameterizedTest
    @CsvSource(value = {"MESUT,mesut","KEREM,kerem"})
    void modifyStringTest(String ex, String ac){
        assertEquals(ex, stringModify.modifyString(ac) );
        System.out.println("çalıştıııı");
    }
}
