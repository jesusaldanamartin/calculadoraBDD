package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.*;


public class StepDefinitions {
	/**
	 * 
	 * @author Jesús Aldana Martín
	 * 
	 */
	private double a,b,ans;
	private int f;
	private boolean arithmetic_thrown, esprimo = false;
	
	/**
	 * GIVEN
	 * En los Given simplemente inicializo las variables igualandolas a los parametros.
	 * Para los primeros test uso las variables a y b ambas Double 
	 * y para el factorial y el primo la variable f Integer 
	 * 
	 * @param numbera, numberb, integer
	 */
	
	@Given("A first number {double}")
	public void a_first_number(Double numbera) {
		a = numbera;
	}
	@Given("A second number {double}")
	public void a_second_number(Double numberb) {
		b = numberb;
	}
	
	@Given("A integer number {int}")
	public void a_integer_number(Integer integer) {
	    f = integer;
	}
	/**
	 *  WHEN
	 *  En estos test se crea un objeto del tipo Calculadora e invocamos en cada uno
	 *  el método en cuestión que queremos comprobar 
	 *  SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN, FACTORIAL y esPRIMO
	 */
	
	@When("I press sum")
	public void i_press_sum() {
	    Calculadora calc = new Calculadora();
	    ans = calc.suma(a, b);
	    
	}
	
	@When("I press minus")
	public void i_press_minus() {
	    Calculadora calc = new Calculadora();
	    ans = calc.resta(a, b);
	}
	
	@When("I press product")
	public void i_press_product() {
		 Calculadora calc = new Calculadora();
		 ans = calc.mult(a, b);
	}
	
	@When("I press division")
	public void i_press_division() {
	    Calculadora calc = new Calculadora();
	    ans = calc.divide(a, b);
	}
	
	@When("I press factorial")
	public void i_press_factorial() {
		Calculadora calc = new Calculadora();
	    ans = calc.fact(f);
	}
		
	@When("I press esPrimo")
	public void i_press_es_primo() {
		Calculadora calc = new Calculadora();
		esprimo = calc.esPrimo(f);

	}
	
	/**
	 * WHEN
	 * Los siguientes TESTS intentan buscar el fallo en la calculadora haciendo los calculos
	 * en el limite de la aritmetica finita de eclipse usando Double.MAX_VALUE y Double.MIN_VALUE,
	 * dividiendo por cero y calculando el fctorial de un número superior al limite de eclipse.
	 * En cada método uso un try-catch para en caso de lanzarse una excepción recogerla en la variable arithmetic_thrown
	 */
	
	@When("I add two infinite numbers")
	public void i_add_two_infinite_numbers() {
	    Calculadora calc = new Calculadora();
		try {
			calc.suma(Double.MAX_VALUE,Double.MAX_VALUE);
		}catch(ArithmeticException e) {
			arithmetic_thrown = true;
		}
	    
	}
	
	@When("I subtract two infinite numbers")
	public void i_subtract_two_infinite_numbers() {
		   Calculadora calc = new Calculadora();
			try {
				calc.resta(Double.MIN_VALUE,1);
			}catch(ArithmeticException e) {
				arithmetic_thrown = true;
			}
	}
	@When("I multiply two infinite numbers")
	public void i_multiply_two_infinite_numbers() {
		   Calculadora calc = new Calculadora();
			try {
				calc.mult(Double.MAX_VALUE,Double.MAX_VALUE);
			}catch(ArithmeticException e) {
				arithmetic_thrown = true;
			}
	}
	
	@When("I divide a number by zero")
	public void i_divide_a_number_by_zero() {
	    Calculadora calc = new Calculadora();
		try {
			calc.divide(Double.MAX_VALUE,0);
		}catch(ArithmeticException e) {
			arithmetic_thrown = true;
		}
	}
	
	@When("I try to test the factorial for a number > sixteen")
	public void i_try_to_test_the_factorial_for_a_number_thirteen() {
		  Calculadora calc = new Calculadora();
			try {
				calc.fact(17);
			}catch(ArithmeticException e) {
				arithmetic_thrown = true;
			}
	}
	
	/**
	 * THEN
	 * TEST común para todos los métodos que comprueben si el resultado es correcto.
	 * Comprueba si la variable resultante ans es igual a la expected (answer)
	 * @param answer
	 */
	
	@Then("the result should be {double} on screen")
	public void the_result_should_be_on_screen(Double answer) {
		assertEquals(ans, answer);
	}
	
	
	/** 
	 *  THEN
	 *  TEST común para todos los métodos que lanzen la excepción ArithmeticException.
	 *  Comprueba si la variable arithmetic_thrown ha encapsulado alguna excepción Aritmetica.
	 */
	
	@Then("test should thrown an ArithmeticException")
	public void test_should_thrown_an_arithmetic_exception() {
		assertTrue(arithmetic_thrown);
	}
	
	/**
	 *  THEN
	 *  Los siguientes tests comprueban si la variable booleana esprimo
	 *  es true or false para el test esPrimo().
	 */
	
	@Then("the result for the int number should be true on screen")
	public void the_result_for_the_int_number_should_be_true_on_screen() {
		assertTrue(esprimo);
	}
	
	@Then("the result for the int number should be false on screen")
	public void the_result_for_the_int_number_should_be_false_on_screen() {
		assertFalse(esprimo);

	}
	
	
}
