package hellocucumber;

public class Calculadora {
	/**
	 * 
	 * @author Jesús Aldana
	 * 
	 */
	
	public double suma(double a,double b){
		double sum = a+b;
		if(sum >= Double.MAX_VALUE) {
			
			throw new ArithmeticException();
		}
		return sum;
	}
	
	public double resta(double a,double b){
		double rest = a-b;
		if(rest <= Double.MIN_VALUE) {
			
			throw new ArithmeticException();
		}
		return rest;
	}
	
	public double mult(double a,double b){
		double mult = a*b;
		if(mult >= Double.MAX_VALUE) {
			
			throw new ArithmeticException();
		}
		return mult;
	}
	
	public double divide(double a,double b){
		double div = 0;
		
		if(a == 0 && b != 0){
			return div;
		}else if(b == 0){
			
			throw new ArithmeticException();
		}
			div = a/b;

		return div;
		
	}
		public int fact(int n) {
			int num = 1;
			if(n == 0) {
				return num;
			}
			
			for(int i = 1; i <= n; i++) {
					num *= i;
			}
			
						
			if(n > 16) {
				throw new ArithmeticException();
			}
			return num;
		}
	
		public boolean esPrimo (int n) {
			if(n < 0) {
				
				throw new ArithmeticException();

			}
			
			int num = 2;
			while(num < n) {
				
				if(n % num == 0) 
					return false;
				
				num++;
			}
		
			return true;
		}
	

	public static void main(String[] args) {
		double a = 5;
		double b = 10;
		int n = 5;
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.suma(a, b));
		System.out.println(calc.mult(a, b));
		System.out.println(calc.divide(a, b));
		System.out.println(calc.fact(n));
		System.out.println(calc.esPrimo(n));
	}
}

