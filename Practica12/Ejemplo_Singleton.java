public class Ejemplo_Singleton {

    private static Ejemplo_Singleton instance;

    private Ejemplo_Singleton () {}

    public static Ejemplo_Singleton getInstance() {
        if (instance == null) {
            instance = new Ejemplo_Singleton();
        }
        return instance;
    }

    public void showClassName() {
        System.out.println("El nombre de la clase es: " + this.getClass().getSimpleName());
    }
}
