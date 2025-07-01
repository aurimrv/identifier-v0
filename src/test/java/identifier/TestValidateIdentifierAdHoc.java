package identifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestValidateIdentifierAdHoc {

	@Test
	public void primeiroTeste() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void nullReferenceTeste() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier(null);
		assertEquals( false, resultadoObtido );
	}	

	@Test
	public void primeiraLetra() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("A");
		assertEquals( true, resultadoObtido );
	}		

	@Test
	public void inicioDigito() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("9");
		assertEquals( false, resultadoObtido );
	}	

	@Test
	public void inicioSimbolo() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("$");
		assertEquals( false, resultadoObtido );
	}	

	@Test
	public void inicioEspaco() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier(" ");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void inicioEspacoLetra() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier(" a");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void validoTamanho4() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("auri");
		assertEquals( true, resultadoObtido );
	}

	@Test
	public void inicioTamanhoMaiorQue6() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("tamanhomaiorqueseis");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void tamanho7() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("a123456");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void tamanho6() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("a 23456");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void tamanho5() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("a 2345");
		assertEquals( false, resultadoObtido );
	}

	@Test
	public void caracteresAcentuados() {
		Identifier id = new Identifier();
		boolean resultadoObtido = id.validateIdentifier("ação");
		assertEquals( false, resultadoObtido );
	}	
}