package pratica7;

public class Main {

	public static void main(String[] args) {
		
		retangulos retangulo = new retangulos();
		retangulo.base1 = 4;
		retangulo.altura1 = 2;
		retangulo.setPerimetro(4,4,2,2);
		System.out.print("A base do ret�ngulo mede: ");
		System.out.println(retangulo.base1);
		System.out.print("A altura do ret�ngulo mede: ");
		System.out.println(retangulo.altura1);
		System.out.print("O per�metro do ret�ngulo mede: ");
		System.out.println(retangulo.getPerimetro(4,4,2,2));
		System.out.print("A �rea do ret�ngulo mede: ");
		System.out.println(retangulo.getArea());
		
		quadrados quadrado = new quadrados();
		quadrado.lado = 2;
		quadrado.setPerimetro(2,2,2,2);
		quadrado.setArea();
		System.out.print("O lado do quadrado mede: ");
		System.out.println(quadrado.lado);
		System.out.print("O per�metro do quadrado mede: ");
		System.out.println(quadrado.getPerimetro(2,2,2,2));
		System.out.print("A �rea do quadrado mede: ");
		System.out.println(quadrado.getArea());
		
		circulos circulo = new circulos();
		circulo.setRaio(3);
		circulo.setPerimetro(3,3,3,3);
		System.out.print("O raio do c�rculo mede: ");
		System.out.println(circulo.getRaio());
		System.out.print("O per�metro do c�rculo mede: ");
		System.out.println(circulo.getPerimetro(3,0,0,0));
		System.out.print("A �rea do c�rculo mede: ");
		System.out.println(circulo.getArea());
		
		

	}

}
