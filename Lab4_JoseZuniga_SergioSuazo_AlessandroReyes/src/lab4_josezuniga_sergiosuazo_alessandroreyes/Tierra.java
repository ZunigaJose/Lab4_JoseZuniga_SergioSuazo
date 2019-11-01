package lab4_josezuniga_sergiosuazo_alessandroreyes;

public class Tierra extends Maestro{

    public Tierra() {
    }

    public Tierra(String nombre, String rango, int edad) {
        super(nombre, rango, edad, 200);
    }
    
    @Override
    public int ataque1() {
        return 40;
    }

    @Override
    public int ataque2() {
        return 45;
    }
    
}
