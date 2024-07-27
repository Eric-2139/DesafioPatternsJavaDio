package one.digitalinnovation;

import one.digitalinnovation.Facade.Facade;
import one.digitalinnovation.Singleton.SingletonEager;
import one.digitalinnovation.Singleton.SingletonLazy;
import one.digitalinnovation.Singleton.SingletonLazyHolder;
import one.digitalinnovation.Strategy.Comportamento;
import one.digitalinnovation.Strategy.ComportamentoAgressivo;
import one.digitalinnovation.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.Strategy.ComportamentoNormal;
import one.digitalinnovation.Strategy.Robo;

public class Teste {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("");

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        System.out.println("");

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        System.out.println("");

        robo.setComportamento(defensivo);
        robo.mover();

        System.out.println("");

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Eric", "15433231704");
    }
}
