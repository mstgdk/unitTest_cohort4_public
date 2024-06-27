import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test09_PerformansTesti {
    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.range(1,1000).forEach(System.out::print)
                );
    }
}
