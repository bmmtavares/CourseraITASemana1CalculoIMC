import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IMCTest {

	@Test
	void testDiagnosticoBaixoPesoMuitoGrave() {
		Paciente paciente1 = new Paciente(40, 1.75);
		assertEquals("Baixo peso muito grave", paciente1.diagnostico());

	}

	@Test
	void testDiagnosticoBaixoPesoGrave() {
		Paciente paciente = new Paciente(50, 1.75);
		assertEquals("Baixo peso grave", paciente.diagnostico());
	}

	@Test
	void testDiagnosticoBaixoPeso() {
		Paciente paciente = new Paciente(55, 1.75);
		assertEquals("Baixo peso", paciente.diagnostico());
	}

	@Test
	void testDiagnosticoPesoNormal() {
		Paciente paciente = new Paciente(85, 1.75);
		assertEquals("Sobrepeso", paciente.diagnostico());
	}

	@Test
	void testDiagnosticoSobrepeso() {
		Paciente paciente = new Paciente(73, 1.75);
		assertEquals("Peso normal", paciente.diagnostico());
	}

	@Test
	void testDiagnosticoObesidadeGrauI() {
		Paciente paciente = new Paciente(93, 1.75);
		assertEquals("Obesidade grau I", paciente.diagnostico());
	}

	@Test
	void testDiagnosticoObesidadeGrauII() {
		Paciente paciente = new Paciente(113, 1.75);
		assertEquals("Obesidade grau II", paciente.diagnostico());
	}

	@Test
	void testDiagnosticoObesidadeGrauIII() {
		Paciente paciente = new Paciente(123, 1.75);
		assertEquals("Obesidade grau III (obesidade mórbida)", paciente.diagnostico());
	}

}
