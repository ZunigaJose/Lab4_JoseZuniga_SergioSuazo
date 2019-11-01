package lab4_josezuniga_sergiosuazo_alessandroreyes;

public class Aire extends Maestro {

    public Aire() {
    }

    public Aire(String nombre, String rango, int edad) {
        super(nombre, rango, edad, 125);
    }
    
    @Override
    public int ataque1() {
        return 35;
    }

    @Override
    public int ataque2() {
        return 42;
    }
    
}
