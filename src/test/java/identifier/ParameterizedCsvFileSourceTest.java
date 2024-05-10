package identifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering Equivalence Partition criterion.
 */
public class ParameterizedCsvFileSourceTest {
    private Identifier id;
    public final long LIMIT=20;

    @BeforeEach
    public void initialize() {
        id = new Identifier();
    }

    @ParameterizedTest(name = "{index} => validateIdentifier({0}) == {1} - {2}")
    @CsvFileSource(resources="/test-data.csv")
    public void validateIdentifier(String input, boolean output, String objetivo) {
        assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier(input);
            assertEquals(output, result);
        }, () -> "Aborted by timeout.");
    }
}