package identifier;

import identifier.Identifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

import static java.time.Duration.ofMillis;

public class TestValidateIdentifier {
	private Identifier id;
	public final long LIMIT=20;

	@BeforeEach
	public void inicializa() {
		id = new Identifier();
	}

	@Test
	public void particioesValidas_1_4_6() {
		assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
			boolean resultadoObtido = id.validateIdentifier("abcde");
			assertEquals( true, resultadoObtido );
		}, () -> "Aborted by timeout.");
	}

	@Test
	public void particiaoInvalida_2() {
		assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
			boolean resultadoObtido = id.validateIdentifier("");
			assertEquals( false, resultadoObtido );
		}, () -> "Aborted by timeout.");
	}	


	@Test
	public void particiaoInvalida_3() {
		assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
			boolean resultadoObtido = id.validateIdentifier("A1b2C3d");
			assertEquals( false, resultadoObtido );
		}, () -> "Aborted by timeout.");
	}

	@Test
	public void particiaoInvalida_5() {
		assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
			boolean resultadoObtido = id.validateIdentifier("2B3");
			assertEquals( false, resultadoObtido );
		}, () -> "Aborted by timeout.");
	}	

	@Test
	public void particiaoInvalida_7() {
		assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
			boolean resultadoObtido = id.validateIdentifier("Z#12");
			assertEquals( false, resultadoObtido );
		}, () -> "Aborted by timeout.");
	}	

	//Testes adicionais
	@Test
	public void testNull() {
		assertTimeoutPreemptively(ofMillis(LIMIT), () -> {
			boolean resultadoObtido = id.validateIdentifier(null);
			assertEquals( false, resultadoObtido );
		}, () -> "Aborted by timeout.");
	}

	@Disabled
	@Test
	public void exception01() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {
			"CBSoft2019".substring(20);
		});
	}
}