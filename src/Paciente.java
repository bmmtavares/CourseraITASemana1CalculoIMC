public class Paciente {

	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {		
		return peso / (altura * altura);
	}
	
	public String diagnostico() {
		double imc = this.calcularIMC();
		String resultado = null;
		
//		Baixo peso muito grave = IMC abaixo de 16 kg/m²
//
//		Baixo peso grave = IMC entre 16 e 16,99 kg/m²
//
//		Baixo peso = IMC entre 17 e 18,49 kg/m²
//
//		Peso normal = IMC entre 18,50 e 24,99 kg/m²
//
//		Sobrepeso = IMC entre 25 e 29,99 kg/m²
//
//		Obesidade grau I = IMC entre 30 e 34,99 kg/m²
//
//		Obesidade grau II = IMC entre 35 e 39,99 kg/m²
//
//		Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
		
		System.out.println("calculo: "+imc);
		
		if(imc < 16) {
			//Baixo peso muito grave 
			resultado="Baixo peso muito grave";
		}
		
		if(imc >=16 && imc <=16.99) {
			//Baixo peso grave
			resultado="Baixo peso grave";
		}
		
		if(imc >=17 && imc <= 18.49) {
			//Baixo peso
			resultado="Baixo peso";
		}
		
		if(imc >=18.50 && imc <= 24.99) {
			//Peso normal
			resultado="Peso normal";
		}
		
		if(imc >=25 && imc <= 29.99) {
			//Sobrepeso
			resultado="Sobrepeso";
		}
		
		if(imc >=30 && imc <= 34.99) {
			//Obesidade grau I
			resultado="Obesidade grau I";
		}
		
		if(imc >=35 && imc <= 39.99) {
			//Obesidade grau II
			resultado="Obesidade grau II";
		}
		
		if(imc >=40) {
			//Obesidade grau III (obesidade mórbida)
			resultado="Obesidade grau III (obesidade mórbida)";
		}
		
		return resultado;
	}
	
}
