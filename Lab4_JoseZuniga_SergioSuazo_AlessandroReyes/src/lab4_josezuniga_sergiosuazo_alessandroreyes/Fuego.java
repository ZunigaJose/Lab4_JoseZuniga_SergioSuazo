package lab4_josezuniga_sergiosuazo_alessandroreyes;

public class Fuego extends Maestro{

    public Fuego() {
        super.setVida(160);
    }

    public Fuego(String nombre, String rango, int edad) {
        super(nombre, rango, edad, 160);
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
