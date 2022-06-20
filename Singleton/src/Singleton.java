import java.awt.*;
  //
public class Singleton {
    // Instancia creada dentro de la clase
    static private Singleton instance = new Singleton();
    // traemos la clase para pintar el cubo y creamos metodo para instanciar
    private Dibujo dibujo;

    private Singleton(){
        dibujo = new Dibujo();
    }

    //Metodo perron para regresar el objeto creado sin instanciar
    public static Singleton getInstance(){
        return instance;
    }
    

    public Dibujo getDibujo(){
        return dibujo;
    }
}
