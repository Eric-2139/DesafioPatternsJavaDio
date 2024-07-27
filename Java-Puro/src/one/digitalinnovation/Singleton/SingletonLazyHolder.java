package one.digitalinnovation.Singleton;

public class SingletonLazyHolder {
    private static class InnerSingletonLazyHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InnerSingletonLazyHolder.instancia;
    }
}
