package pratica7;

public abstract class quadrilateros implements FormaGeometrica {
	float perimetro;
	float lado1;
	float lado2;
	float lado3;
	float lado4;
	
	public quadrilateros() {
		setPerimetro( lado1,  lado2,  lado3,  lado4);
		getPerimetro(lado1, lado2, lado3, lado4);
	}
	
	public void setPerimetro(float lado1, float lado2, float lado3, float lado4) {
		perimetro = (lado1+lado2+lado3+lado4);
	}
	
	public float getPerimetro(float lado1, float lado2, float lado3, float lado4) {
		setPerimetro(lado1,  lado2,  lado3,  lado4);
		return perimetro;
	}
    	 
}