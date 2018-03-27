package matala1;

public class Complex {

	private double a;
	private double b;
	
	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	public  double module(){ 
		double s=(Math.pow(a, 2)+Math.pow(b, 2));
		return Math.abs(Math.sqrt(s));
	} 
	public void add (Complex z){ 
		this.a=this.a+z.a;
		this.b=this.b+z.b;
	} 
    public void mul (Complex z){
    	this.a=(this.a*z.a)-(this.b*z.b);
    	this.b=(this.a*z.b)+(z.a*this.b);
    }
    
    public int compare(Complex z)
    {
    	double module1 ,module2;
    	module1=this.module();
    	module2=z.module();
    	if(module1<module2) return -1;
    	if (module1>module2) return 1;
    	return 0;
    }
	
	

}
