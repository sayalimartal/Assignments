
public class Complex {

	private float real;
	private float imaginary;
	
	public void set(float real,float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	} 
	
	public float getReal() {
		return real;
	}
	
	public float getImaginary() {
		return imaginary;
	}
	
	public Complex sum(Complex C1,Complex C2) {
		Complex C3=new Complex();
		
		C3.real=C1.real+C2.real;
		C3.imaginary=C1.imaginary+C2.imaginary;
		return C3;
	}
	
	
	
	
}
