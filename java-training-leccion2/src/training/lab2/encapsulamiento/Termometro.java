package training.lab2.encapsulamiento;

public class Termometro {
	
	private double celsius; 
	private double fahrenheit; 
	private double kelvin;
	
	/**
	 * @return the celsius
	 */
	public double getCelsius() {
		return celsius;
	}
	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
		this.fahrenheit = (celsius * 1.8) + 32;  //Establecemos los valores para fahrenheit y kelvin
		this.kelvin = celsius + 273.15;
	}
	/**
	 * @return the fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}
	/**
	 * @param fahrenheit the fahrenheit to set
	 */
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	/**
	 * @return the kelvin
	 */
	public double getKelvin() {
		return kelvin;
	}
	/**
	 * @param kelvin the kelvin to set
	 */
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
}
	
