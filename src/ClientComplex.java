public class ClientComplex {

public static void main(String[] args) {
	
	Complex z1 = new Complex(2, 2);
	Complex z2 = new Complex(3, 3);
	
	z1.Afisare();
	
	double module = z1.ComplexContor();
	System.out.println("Suma :" + module);
	
	int contor = z1.ComplexContor();
	System.out.println("Numerele complexe: " + contor);
	
	Complex z3 = z1.Suma(z2);
	
	z3.Afisare();
	z1.ComplexContor();
}
}