package lab4_josezuniga_sergiosuazo_alessandroreyes;

public class Avatar extends Maestro {
    private Fuego mFuego;
    private Agua mAgua;
    private Aire mAire;
    private Tierra mTierra;
    public Avatar() {
    }
    
    public Avatar(String nombre) {
        super(nombre, 350);
        this.mFuego = new Fuego();
        this.mAgua = new Agua();
        this.mAire = new Aire();
        this.mTierra = new Tierra();
    }

    public Fuego getmFuego() {
        return mFuego;
    }

    public void setmFuego(Fuego mFuego) {
        this.mFuego = mFuego;
    }

    public Agua getmAgua() {
        return mAgua;
    }

    public void setmAgua(Agua mAgua) {
        this.mAgua = mAgua;
    }

    public Aire getmAire() {
        return mAire;
    }

    public void setmAire(Aire mAire) {
        this.mAire = mAire;
    }

    public Tierra getmTierra() {
        return mTierra;
    }

    public void setmTierra(Tierra mTierra) {
        this.mTierra = mTierra;
    }

    @Override
    public int ataque1() {
    return 0;
    }

    @Override
    public int ataque2() {
        return 0;
    }    
    
}
