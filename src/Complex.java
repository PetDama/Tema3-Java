public class Complex {
	
	private double x;
	private double y;
	private static int contor = 0;

	public Complex(double x, double y) {
		this.x = x;
		this.y = y;
		contor++;
	}
	
	public double Module() {
		double module = Math.sqrt((x*x + y*y));
		return module;	
	}
	
	public void Afisare () {
		System.out.println("Numarul complex: " + x + " i * " + y );
	}
	
	public Complex Suma(Complex z) {
		Complex S = new Complex(z.x, z.y) ;
		S.x = S.x + x;
		S.y = S.y + y;
		return S;
	}
	
	public int ComplexContor () {
		return contor;
	}
	
}