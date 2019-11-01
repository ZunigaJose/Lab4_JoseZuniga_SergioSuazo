package lab4_josezuniga_sergiosuazo_alessandroreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_JoseZuniga_SergioSuazo_AlessandroReyes {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <Maestro> maestros= new ArrayList();
        char wh = 's';
        while(wh == 's'){
            System.out.print("Ingrese el numero de la opcion que desea ver"
                    + "\n0) Salir"
                    + "\n1) Crear el Avatar"
                    + "\n2) Crear Maestro Aire"
                    + "\n3) Crear Maestro Fuego"
                    + "\n4) Crear Maestro Agua"
                    + "\n5) Crear Maestro Tierra"
                    + "\n6) Crear Maestro Ozai"
                    + "\n7) Listar Maestros"
                    + "\n8) Pelear");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 0:
                    wh = 'n';
                    break;
                case 1:
                    System.out.print("Cual es el nombre del avatar: ");
                    String nombre = leer.next();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    String rango = leer.next();
                    Maestro ava = new Avatar();
                    
                    break;
                case 2://aire
                    System.out.print("Cual es el nombre del Maestro de aire: ");
                    nombre = leer.next();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.next();
                    System.out.print("Cual es la edad de "+nombre+" : ");
                    int edad = leer.nextInt();
                    Maestro air = new Aire();
                    air.setEdad(edad);
                    air.setNombre(nombre);
                    air.setRango(rango);
                    air.getVida();
                    maestros.add(air);
                    break;
                case 3://fuego
                    System.out.print("Cual es el nombre del maestro de fuego: ");
                    nombre = leer.next();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.next();
                    System.out.print("Cual es la edad de "+nombre+" : ");
                    edad = leer.nextInt();
                    Maestro fire = new Fuego();
                    fire.setEdad(edad);
                    fire.setNombre(nombre);
                    fire.setRango(rango);
                    fire.getVida();
                    maestros.add(fire);
                    break;
                case 4://agua
                    System.out.print("Cual es el nombre del maestro de agua: ");
                    nombre = leer.next();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.next();
                    System.out.print("Cual es la edad de "+nombre+" : ");
                    edad = leer.nextInt();
                    Maestro water = new Agua();
                    water.setEdad(edad);
                    water.setNombre(nombre);
                    water.setRango(rango);
                    water.getVida();
                    maestros.add(water);
                    break;
                case 5://tierra
                    System.out.print("Cual es el nombre del maestro de tierra: ");
                    nombre = leer.next();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.next();
                    System.out.print("Cual es la edad de "+nombre+" : ");
                    edad = leer.nextInt();
                    Maestro earth = new Tierra();
                    earth.setEdad(edad);
                    earth.setNombre(nombre);
                    earth.setRango(rango);
                    earth.getVida();
                    maestros.add(earth);
                    break;
                case 6://zai
                    nombre = "Ozai";
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.next();
                    System.out.print("Cual es la edad de "+nombre+" : ");
                    edad = leer.nextInt();
                    Maestro Ozai = new FuegoZai();
                    Ozai.setEdad(edad);
                    Ozai.setNombre(nombre);
                    Ozai.setRango(rango);
                    Ozai.getVida();
                    break;
                case 7:
                    System.out.println("Maestros Aire: ");
                    String salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Aire){
                            salida += "" + maestros.indexOf(t) + ") " + t + "\n";
                        } 
                    }
                    System.out.println(salida);
                    System.out.println("Maestros Fuego: ");
                    salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Fuego){
                            salida += "" + maestros.indexOf(t) + ") " + t + "\n";
                        } 
                    }
                    System.out.println(salida);
                    System.out.println("Maestros Agua: ");
                    salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Agua){
                            salida += "" + maestros.indexOf(t) + ") " + t + "\n";
                        } 
                    }
                    System.out.println(salida);
                    System.out.println("Maestros Tierra: ");
                    salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Tierra){
                            salida += "" + maestros.indexOf(t) + ") " + t + "\n";
                        } 
                    }
                    System.out.println(salida);
                    
                    break;
                case 8://pelear
                    
                    break;
            }//fin del switch
        }//fin del while
    }//fin del main
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //comenza aqui
}
