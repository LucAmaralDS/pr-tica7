package pratica7;

public class retangulos extends quadrilateros {
	float base1;
	float base2;
	float altura1;
	float altura2;
	float area;
	
	public retangulos(){
		super.getPerimetro(base1,base2,altura1,altura2);
		super.setPerimetro(base1,base2,altura1,altura2);
		setArea();
	}
	
	public float getArea() {
		setArea();
		return area;
	}
	public void setArea() {
		area = (base1*altura1);

}
}