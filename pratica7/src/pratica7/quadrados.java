package pratica7;

public class quadrados extends quadrilateros {
	protected float area;
	protected float lado;
	
	public quadrados() {
		super.setPerimetro(lado,lado,lado,lado);
		setArea();
	}

	public float getArea() {
		setArea();
		return area;
	}
	
	public void setArea() {
		area = lado*lado;
	}

}