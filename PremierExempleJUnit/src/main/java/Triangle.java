
public class Triangle {
	public static int triangle(double a, double b, double c) {

		        if (a <= 0 || b <= 0 || c <= 0) {
		            return 0; // Le triangle est invalide
		        }
		        if (a + b <= c || a + c <= b || b + c <= a) {
		            return 0; // Le triangle est invalide
		        } 
		        if (a == b && b == c) {
		            return 1; // Le triangle est équilatéral
		        }
		        if (a == b || a == c || b == c) {
		            return 2; // Le triangle est isocèle
		        }
		        return 3;
	
		
	}
}
