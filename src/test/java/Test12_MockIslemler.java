import com.patika.MockIslemler;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class Test12_MockIslemler {
    @Test
    void islem(){
     MockIslemler dummyObj = Mockito.mock(MockIslemler.class);
     dummyObj.addUser("Mesut");

     //acaba bu metot çağrıldı mı
        verify(dummyObj).addUser("Mesut");



    }
}
