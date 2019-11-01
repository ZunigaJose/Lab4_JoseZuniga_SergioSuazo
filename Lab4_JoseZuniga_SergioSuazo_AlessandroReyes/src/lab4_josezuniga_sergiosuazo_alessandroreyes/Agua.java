package lab4_josezuniga_sergiosuazo_alessandroreyes;

public class Agua extends Maestro{

    public Agua() {
        super.setVida(145);
    }

    public Agua(String nombre, String rango, int edad) {
        super(nombre, rango, edad, 145);
    }
    
    @Override
    public int ataque1() {
        return 38;
    }

    @Override
    public int ataque2() {
        return 45;
    }
    
}
