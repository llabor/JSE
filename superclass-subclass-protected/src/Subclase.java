
public class Subclase extends Superclase{
	
	private int c;
	
	public Subclase(int a, int b, int c){
		super(a, b); 
		this.setA(0);
		this.c = c;
	}
	
	public void TestProtected() {
		//super.a = 4; a es 'private' => inaccesible desde aquí
		super.b = 0; // Confirmamos que podemos acceder desde esta subclase 
	}                // al atributo 'protected' b de la superclase.
}
