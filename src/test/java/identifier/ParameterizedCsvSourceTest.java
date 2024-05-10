package identifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering Equivalence Partition criterion.
 */
public class ParameterizedCsvSourceTest {
    private Identifier id;
    public final long LIMIT=20;

    @BeforeEach
    public void initialize() {
        id = new Identifier();
    }

    @ParameterizedTest
    @CsvSource({"abc, true",
                "'', false",
                "A1b2C3d,false",
                "2B3,false",
                "Z#12, false",
                "abcdef, true"})
    public void validateIdentifier(String input, boolean output) {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier(input);
            assertEquals(output, result);
        }, () -> "Aborted by timeout.");
    }
}