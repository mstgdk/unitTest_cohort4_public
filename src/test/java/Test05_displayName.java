import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05_displayName {
    @Test
    @DisplayName("parsInt() metoduna numeric olmayan argüman gönderildiğinde................")
    void girilen_stringi_integera_ceviren_metodun_testi(){
        String str = "Merhaba";
        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str);
        });
    }

}
