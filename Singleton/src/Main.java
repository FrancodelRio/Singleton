public class Main {
    public static void main(String[] args) {
        //Obtenemos la instancia que se creo dentro del singleton 
        Singleton singleton = Singleton.getInstance();
        //Usamos el metodo getDibujo para el objeto de dibujo y luego el metodo mostrar 
        singleton.getDibujo().mostrar();
    }
}
