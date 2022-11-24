
public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente(74, 1.75);
		System.out.println(paciente1.diagnostico());
		
		Paciente paciente2 = new Paciente(84, 1.70);
		System.out.println(paciente2.diagnostico());
		
		Paciente paciente3 = new Paciente(50, 1.73);
		System.out.println(paciente3.diagnostico());

	}

}
