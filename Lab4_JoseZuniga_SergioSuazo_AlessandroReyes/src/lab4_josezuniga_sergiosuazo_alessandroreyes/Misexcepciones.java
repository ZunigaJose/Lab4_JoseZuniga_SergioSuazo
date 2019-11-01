package lab4_josezuniga_sergiosuazo_alessandroreyes;

import java.awt.Color;

public class Misexcepciones extends Exception{
    private Color color;
    public Misexcepciones() {
        super();
    }

    public Misexcepciones(Color color, String string) {
        super(string);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Misexcepciones{" + '}';
    }
    
}
