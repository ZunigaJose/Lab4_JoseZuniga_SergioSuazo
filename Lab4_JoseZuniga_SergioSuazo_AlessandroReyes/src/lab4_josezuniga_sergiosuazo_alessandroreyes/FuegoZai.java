package lab4_josezuniga_sergiosuazo_alessandroreyes;

public class FuegoZai extends Maestro{

    private Fuego mFuego;
    
    public FuegoZai() {
        super.setVida(400);
    }

    public FuegoZai(Fuego mFuego, String nombre, String rango, int edad, int vida) {
        super(nombre, rango, edad, vida);
        this.mFuego = new Fuego();
    }

    public FuegoZai(String nombre, String rango, int edad) {
        super(nombre, rango, edad, 400);
    }

    public Fuego getmFuego() {
        return mFuego;
    }

    public void setmFuego(Fuego mFuego) {
        this.mFuego = mFuego;
    }
    
    @Override
    public int ataque1() {
        return 100;
    }

    @Override
    public int ataque2() {
        return 0;
    }
    
    
}
