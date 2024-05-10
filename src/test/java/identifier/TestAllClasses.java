package identifier;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({identifier.TestValidateIdentifier.class,
        identifier.TestValidateIdentifierAdHoc.class})

public class TestAllClasses {}