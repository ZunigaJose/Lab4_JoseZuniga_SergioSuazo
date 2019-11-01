package lab4_josezuniga_sergiosuazo_alessandroreyes;

public abstract class Maestro {
    private String nombre, rango;
    private int edad;
    private int vida;

    public Maestro() {
    }

    public Maestro(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public Maestro(String nombre, String rango, int edad, int vida) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public abstract int ataque1();
    
    public abstract int ataque2();

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Rango: " + rango + " Edad: " + edad + ", vida=" + vida;
    }
 
    
}
