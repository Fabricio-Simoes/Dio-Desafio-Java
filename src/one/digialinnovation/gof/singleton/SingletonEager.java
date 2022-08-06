package one.digialinnovation.gof.singleton;

/**
 * Singleton "ligeiro"
 * 
 * @author fabri
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
