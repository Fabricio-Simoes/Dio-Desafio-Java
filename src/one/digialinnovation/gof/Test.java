package one.digialinnovation.gof;

import one.digialinnovation.gof.facade.Facade;
import one.digialinnovation.gof.singleton.SingletonEager;
import one.digialinnovation.gof.singleton.SingletonLazy;
import one.digialinnovation.gof.singleton.SingletonLazyHolder;
import one.digialinnovation.gof.strategy.Comportamento;
import one.digialinnovation.gof.strategy.ComportamentoAgressivo;
import one.digialinnovation.gof.strategy.ComportamentoDefensivo;
import one.digialinnovation.gof.strategy.ComportamentoNormal;
import one.digialinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Fabricio","26220470");
		
		
	}

}
