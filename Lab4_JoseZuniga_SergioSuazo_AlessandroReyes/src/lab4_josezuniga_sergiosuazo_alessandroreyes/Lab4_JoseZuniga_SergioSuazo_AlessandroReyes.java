package lab4_josezuniga_sergiosuazo_alessandroreyes;


import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Lab4_JoseZuniga_SergioSuazo_AlessandroReyes {
    static Random rand=new Random();
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList <Maestro> maestros= new ArrayList();
        int contA =0;
        int contO =0;
        int contMF =0;
        int contm=0;
        char wh = 's';
        while(wh == 's'){
            System.out.print(""
                    + "\n0) Salir"
                    + "\n1) Crear el Avatar"
                    + "\n2) Crear Maestro Aire"
                    + "\n3) Crear Maestro Fuego"
                    + "\n4) Crear Maestro Agua"
                    + "\n5) Crear Maestro Tierra"
                    + "\n6) Crear Maestro Ozai"
                    + "\n7) Listar Maestros"
                    + "\n8) Pelear"
                    + "\n Ingrese el numero de la opcion que desea ver: ");
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 0:
                    wh = 'n';
                    break;
                case 1:
                    try {
                        validarAvatar(contA);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                        break;
                    }
                    System.out.print("Cual es el nombre del avatar: ");
                    String nombre = leer.next();
                    Maestro ava = new Avatar();
                    ava.setNombre(nombre);
                    ava.getVida();
                    maestros.add(ava);
                    contA++;
                    break;
                case 2://aire
                    System.out.print("Cual es el nombre del Maestro de aire: ");
                    nombre = leer.next();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    String rango = leer.next();
                    System.out.print("Cual es la edad de "+nombre+" : ");
                    int edad = leer.nextInt();
                    Maestro air = new Aire();
                    air.setEdad(edad);
                    air.setNombre(nombre);
                    air.setRango(rango);
                    air.getVida();
                    maestros.add(air);
                    contm++;
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
                    contMF++;
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
                    contm++;
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
                    contm++;
                    break;
                case 6://zai
                    try {
                        validarOzai(contO);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                        break;
                    }
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
                    maestros.add(Ozai);
                    contO++;
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
                    try {
                        validarAvatarJ(contA);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                        break;
                    }
                    try {
                        validarOzaiJ(contO);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                        break;
                    }
                    try {
                        validarMaestrosF(contMF);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                        break;
                    }
                    try {
                        validarMaestros(contm);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                        break;
                    }
                    break;
                default: 
                    try {
                        validarOpcion(opcion);
                    } catch (Misexcepciones ex) {
                        System.out.println(ex.getMessage());
                    }
                
            }//fin del switch
        }//fin del while
    }//fin del main
    static void validarOpcion(int x)throws Misexcepciones{
        if(x < 0 || x > 7){
            throw new Misexcepciones(Color.red,"\n Numero fuera de las opciones\n ");
        }
    }
    
    static void validarVic(int x)throws Misexcepciones{
        if(x == 0){
            throw new Misexcepciones(Color.red,"\n Felicidades, gano \n");
        }
    }
    
    static void validarLostA(int x)throws Misexcepciones{
        if(x == 0){
            throw new Misexcepciones(Color.red,"\n Perdio, intente de nuevo \n");
        }
    }
    static void validarLostM(int x, int y)throws Misexcepciones{
        if(x==0 && y==0){
            throw new Misexcepciones(Color.red,"\n Perdio, suerte a la proxima \n");
        }
    }
    static void validarMaestrosF(int x)throws Misexcepciones{
        if(x < 4){
            throw new Misexcepciones(Color.red,"\n Se ocupan 4 maestros fuego para empezar el juego \n");
        }
    }
    
    static void validarAvatar(int x)throws Misexcepciones{
        if (x >= 1){
            throw new Misexcepciones(Color.red,"\n Solo puede haber un avatar \n");
        }     
    }
    
    static void validarAvatarJ(int x)throws Misexcepciones{
        if(x == 0 ){
            throw new Misexcepciones(Color.red,"\n Se ocupa crear un avatar para empezar a jugar \n");
        }     
    }
    
    static void validarMaestros(int x)throws Misexcepciones{
        if(x < 2 ){
            throw new Misexcepciones(Color.red,"\n Ocupa tener 2 maestros, ademas de los de fuego \n");
        }
    }
    
    static void validarOzai(int x)throws Misexcepciones{
        if (x >= 1){
            throw new Misexcepciones(Color.red,"\n Solo puede haber un Ozai \n");
        }
    }
    
    static void validarOzaiJ(int x)throws Misexcepciones{
        if(x == 0 ){
            throw new Misexcepciones(Color.red,"\n Se ocupa crear a Ozai para empezar a jugar \n");
        }
    }
    
    static void validarOpcionAtt(int x)throws Misexcepciones{
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      public static int danio(String op1, String op2, Maestro jugador) {
        char op;
        int num;
        System.out.print("a. " + op1 + "\n"
                + "b. " + op2 + ": ");
        op = leer.nextLine().toLowerCase().charAt(0);
          switch (op) {
              case 'a':
                  num = jugador.ataque1();
                  break;
              case 'b':
                  num = jugador.ataque2();
                  break;
              default:
                  return danio(op1, op2, jugador);
          }
          return num;
    }

    
    
    
    
    
    
    
    
    
    
public static void Simulacion(Maestro j1,Maestro j2)
{
    Avatar a;
    //Tsai t;
    int ronda=0;
    int turno=0;
    int ataque;
    int atacar;
    int modo=0;
    boolean game=false;
    while(game=false)
    {
        switch(ronda)
        {
            case 0:
            {
                if(turno%2==0)
                {
                    System.out.print("A cual jugador desea atacar?\n"
                            + "1. Enemigo 1\n"
                            + "2. Enemigo 2: ");
                    //imprimir ataques j1
                    System.out.println("Elija el ataque: ");
                    if (j1 instanceof Aire) {
                        ataque = danio("Bola de Aire", "Remolino", j1);
                    }
                    if (j1 instanceof Agua) {
                        ataque = danio("Latigo de Agua", "Huracan", j1);
                    }
                    if (j1 instanceof Tierra) {
                        ataque = danio("Muralla", "Terremoto", j1);
                    }
                    if (j1 instanceof Fuego) {
                        ataque = danio("Incendio", "Lanzallamas", j1);
                    }
                    
                    //traer daño de ataque
                }
                else
                {
                    //imprimir ataques j2
                    System.out.println("Elija el ataque: ");
                    //traer daño de ataque
                }
                ataque=rand.nextInt(2);
                atacar=rand.nextInt(2);
                //afectar daño
                break;
            }
            case 1:
            {
                
            }
            case 2:
            {
                if(modo==0)
                {
                    String resp="";
                    System.out.println("Desea subir a modo Avatar? (s/n");
                    resp=leer.next();
                    if(resp=="s")
                    {
                        //setlife 550;
                    }
                    else
                    {
                        //setlife 300;
                    }
                    modo=1;
                }
                //listar ataques
                System.out.println("Selecione el ataque: ");
                ataque=leer.nextInt();
                //traer y affectar dano
                ataque=rand.nextInt(3);
                //traer y afectar dano   
            }
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //comenza aqui
}
