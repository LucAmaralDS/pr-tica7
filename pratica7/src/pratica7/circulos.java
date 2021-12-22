package pratica7;

public class circulos implements FormaGeometrica{
	private float raio;
	private float area;
	private float perimetro;
	
	public circulos(float raio) {
		this.raio = raio;
		raio = 1;
	}
	public circulos() {
		setRaio(raio);		
	}
	
	public float getRaio() {
		setRaio(raio);
		return raio;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getArea() {
		setArea();
		return area;
	}
	public void setArea() {
		area = 3.14f*raio*raio;
	}
	public float getPerimetro(float raio,float raio2 ,float raio3,float raio4) {
		setPerimetro(raio, raio, raio, raio);
		return perimetro;
	}
		public void setPerimetro(float raio, float raio2 ,float raio3,float raio4) {
		perimetro = 2*3.14f*raio;
	}
	
	
	
	

}