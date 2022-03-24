package src.lesson12;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TringleTest {
    @Test
    public void lambdaExpressions() {
            assertTrue(Stream.of(3, 6, 5)
                    .mapToInt(i -> i)
                    .sum() > 5,() -> "Sum  должен быть больше 5");
        }
    }
