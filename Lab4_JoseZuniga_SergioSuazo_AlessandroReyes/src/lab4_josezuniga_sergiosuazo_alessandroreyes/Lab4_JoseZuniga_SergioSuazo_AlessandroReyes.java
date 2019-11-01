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
                    String nombre = leer.nextLine();
                    Maestro ava = new Avatar();
                    ava.setNombre(nombre);
                    ava.getVida();
                    maestros.add(ava);
                    contA++;
                    break;
                case 2://aire
                    System.out.print("Cual es el nombre del Maestro de aire: ");
                    nombre = leer.nextLine();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    String rango = leer.nextLine();
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
                    nombre = leer.nextLine();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.nextLine();
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
                    nombre = leer.nextLine();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.nextLine();
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
                    nombre = leer.nextLine();
                    System.out.print("Cual es el rango de "+nombre+" : ");
                    rango = leer.nextLine();
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
                    rango = leer.nextLine();
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
                    imprimir(maestros);
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
                    imprimir(maestros);
                    System.out.print("Seleccione la posicion de un maestro: ");
                    int m1 = leer.nextInt();
                    leer.nextLine();
            {
                try {
                    validarAL(maestros, m1);
                } catch (Misexcepciones ex) {
                    System.out.println(ex.getMessage());
                    break;
                }
                    System.out.print("Seleccione la posicion de un maestro: ");
                    int m2 = leer.nextInt();
                    leer.nextLine();
                try {
                    validarAL(maestros, m2);
                } catch (Misexcepciones ex) {
                    System.out.println(ex.getMessage());
                    break;
                }
                Avatar avata = new Avatar();
                FuegoZai zai = new FuegoZai();
                ArrayList<Fuego> listaFuego = new ArrayList<>();
                for (Maestro m : maestros) {
                    if (m instanceof Fuego) {
                        listaFuego.add((Fuego)(m));
                    }
                    if (m instanceof Avatar) {
                        avata = (Avatar)(m);
                    }
                    if (m instanceof FuegoZai) {
                        zai = (FuegoZai)(m);
                    }
                }
                Simulacion(maestros.get(m1), maestros.get(m2), listaFuego.get(0), listaFuego.get(1), listaFuego.get(2),listaFuego.get(3), avata, zai);
            }
                
            }//fin del switch
        }//fin del while
    }//fin del main
    static void validarOpcion(int x)throws Misexcepciones{
        if(x < 0 || x > 7){
            throw new Misexcepciones(Color.red,"\n Numero fuera de las opciones\n ");
        }
    }
    
    static void validarAL(ArrayList x, int num)throws Misexcepciones{
        if(num < 0 || num >= x.size()){
            throw new Misexcepciones(Color.red,"\n Numero fuera de las opciones\n ");
        }
    }
    
    static void validarVic(int x)throws Misexcepciones{
        if(x <= 0){
            throw new Misexcepciones(Color.red,"\n Felicidades, gano \n");
        }
    }
    
    static void validarLostA(int x)throws Misexcepciones{
        if(x <= 0){
            throw new Misexcepciones(Color.red,"\n Perdio, intente de nuevo \n");
        }
    }
    static void validarLostM(int x, int y)throws Misexcepciones{
        if(x<=0 && y<=0){
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
    
    
    public static void imprimir(ArrayList<Maestro> maestros){
                            System.out.println("Maestros Aire: ");
                    String salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Aire){
                            System.out.println(maestros.indexOf(t) + " " + t);
                        } 
                    }
                    System.out.println("Maestros Fuego: ");
                    salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Fuego){
                            System.out.println(maestros.indexOf(t) + " " + t);
                        } 
                    }
                    System.out.println("Maestros Agua: ");
                    salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Agua){
                            System.out.println(maestros.indexOf(t) + " " + t);
                        } 
                    }
                    System.out.println("Maestros Tierra: ");
                    salida = " ";
                    for (Object t : maestros) {
                        if(t instanceof Tierra){
                            System.out.println(maestros.indexOf(t) + " " + t);
                        } 
                    }
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


    
    
    
    
public static void Simulacion(Maestro j1,Maestro j2,Maestro j3,Maestro j4,Maestro f1,Maestro f2,Avatar a,FuegoZai z)
{
    int ronda=0;
    int vida;
    int atacar;
    int modo=0;
    boolean game=false;
    while(game=false)
    {
        int ataque=0;
        switch(ronda)
        {
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 0:
            {
                    System.out.print("A cual jugador desea atacar?\n"
                            + "1. Enemigo 1\n"
                            + "2. Enemigo 2: ");
                    atacar=leer.nextInt();
                    System.out.println("Elija el ataque del j1: ");
                    if (j1 instanceof Aire) {
                        ataque = danio("Bola de Aire", "Remolino", j1);
                    }
                    if (j1 instanceof Agua) {
                        ataque = danio("Latigo de Agua", "Huracan", j1);
                        ataque *= 1.20;
                    }
                    if (j1 instanceof Tierra) {
                        ataque = danio("Muralla", "Terremoto", j1);
                    }
                    if (j1 instanceof Fuego) {
                        ataque = danio("Incendio", "Lanzallamas", j1);
                    }
                    if(atacar==1)
                    {
                        j3.setVida(j3.getVida()-ataque);
                    }
                    else
                    {
                        j4.setVida(j4.getVida()-ataque);
                    }
                    //jugador 2
                    System.out.print("A cual jugador desea atacar?\n"
                            + "1. Enemigo 1\n"
                            + "2. Enemigo 2: ");
                    atacar=leer.nextInt();
                    System.out.println("Elija el ataque del j2: ");
                    if (j2 instanceof Aire) {
                        ataque = danio("Bola de Aire", "Remolino", j2);
                    }
                    if (j2 instanceof Agua) {
                        ataque = danio("Latigo de Agua", "Huracan", j2);
                    }
                    if (j2 instanceof Tierra) {
                        ataque = danio("Muralla", "Terremoto", j2);
                    }
                    if (j2 instanceof Fuego) {
                        ataque = danio("Incendio", "Lanzallamas", j2);
                    }
                    if(atacar==1)
                    {
                        j3.setVida(j3.getVida()-ataque);
                    }
                    else
                    {
                        j4.setVida(j4.getVida()-ataque);
                    }
                if(j3.getVida()<=0&&j4.getVida()<=0)
                {
                    ronda++;
                }
                    
                    
                //Ataque compu1
                ataque=rand.nextInt(2);
                if(ataque==0)
                {
                    ataque=j3.ataque1();
                }
                else
                {
                    ataque=j3.ataque2();
                }
                atacar=rand.nextInt(2);
                if(atacar==0)
                {
                    j1.setVida(j1.getVida()-ataque);
                }
                else
                {
                    j2.setVida(j2.getVida()-ataque);
                }
                //Ataque cpu2
                ataque=rand.nextInt(2);
                if(ataque==0)
                {
                    ataque=j4.ataque1();
                }
                else
                {
                    ataque=j4.ataque2();
                }
                atacar=rand.nextInt(2);
                if(atacar==0)
                {
                    j1.setVida(j1.getVida()-ataque);
                }
                else
                {
                    j2.setVida(j2.getVida()-ataque);
                }   
            try {
                validarLostM(j1.getVida(), j2.getVida());
            } catch (Misexcepciones ex) {
                System.out.println(ex.getMessage());
                game=true;
            }
                break;
            }
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 1:
            {
                int dmg;
                System.out.println("Seleccione que ataque usar: "
                        + "1- Bola de Aire"
                        + "2- Remolino"
                        + "3- Latigo de Agua"
                        + "4- Huracan"
                        + "5- Muralla"
                        + "6- Terremoto"
                        + "7- Incendio"
                        + "8- Lanzallamas");
                ataque=leer.nextInt();
                switch(ataque)
                {
                    case 1: dmg=a.getmAire().ataque1();
                    case 2: dmg=a.getmAire().ataque2();
                    case 3: dmg=a.getmAgua().ataque1();
                    case 4: dmg=a.getmAgua().ataque2(); 
                    case 5: dmg=a.getmTierra().ataque1();
                    case 6: dmg=a.getmTierra().ataque2();
                    case 7: dmg=a.getmFuego().ataque1();
                    case 8: dmg=a.getmFuego().ataque2();                    
                }
                System.out.print("A cual jugador desea atacar?\n"
                            + "1. Enemigo 1\n"
                            + "2. Enemigo 2: ");
                atacar=leer.nextInt();                
                if(atacar==1)
                {
                    f1.setVida(f1.getVida()-ataque);
                }
                else
                {
                    f2.setVida(f2.getVida()-ataque);
                }
                if(f1.getVida()<=0&&f2.getVida()<=0)
                {
                    ronda++;
                }
                
                ataque=rand.nextInt(2);
                if(ataque==0)
                {
                    ataque=f1.ataque1();
                }
                else
                {
                    ataque=f1.ataque2();
                }    
                //Ataque cpu 1
                ataque=rand.nextInt(2);
                if(ataque==0)
                {
                    ataque=f2.ataque1();
                }
                else
                {
                    ataque=f2.ataque2();
                }
                a.setVida(a.getVida()-ataque);
                
                //Ataque cpu2
                ataque=rand.nextInt(2);
                if(ataque==0)
                {
                    ataque=j4.ataque1();
                }
                else
                {
                    ataque=j4.ataque2();
                }
                a.setVida(a.getVida()-ataque);
            try {
                validarLostA(a.getVida());
            } catch (Misexcepciones ex) {
                System.out.println(ex.getMessage());
                game=false;
            }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:
            {
                int daño=0;
                if(modo==0)
                {
                    String resp="";
                    System.out.println("Desea subir a modo Avatar? (s/n");
                    resp=leer.next();
                    if(resp=="s")
                    {
                        a.setVida(550);
                    }
                    else
                    {
                        a.setVida(350);
                    }
                    modo=1;
                }
                //listar ataques
                int dmg;
                System.out.println("Seleccione que ataque usar: "
                        + "1- Bola de Aire"
                        + "2- Remolino"
                        + "3- Latigo de Agua"
                        + "4- Huracan"
                        + "5- Muralla"
                        + "6- Terremoto"
                        + "7- Incendio"
                        + "8- Lanzallamas");
                ataque=leer.nextInt();
                switch(ataque)
                {
                    case 1: dmg=a.getmAire().ataque1();
                    case 2: dmg=a.getmAire().ataque2();
                    case 3: dmg=a.getmAgua().ataque1();
                    case 4: dmg=a.getmAgua().ataque2(); 
                    case 5: dmg=a.getmTierra().ataque1();
                    case 6: dmg=a.getmTierra().ataque2();
                    case 7: dmg=a.getmFuego().ataque1();
                    case 8: dmg=a.getmFuego().ataque2();                    
                }
            try {
                validarVic(z.getVida());
            } catch (Misexcepciones ex) {
                System.out.println(ex.getMessage());
                game=true;
            }
                ataque=rand.nextInt(3);
                if(ataque==0)
                {
                    daño=z.ataque1();
                }
                if(ataque==1)
                {
                    daño=z.getmFuego().ataque1();
                }
                if(ataque==2)
                {
                    daño=z.getmFuego().ataque2();
                }
                a.setVida(a.getVida()-daño);
            try {
                validarLostA(a.getVida());
            } catch (Misexcepciones ex) {
                System.out.println(ex.getMessage());
                game=true;
            }
            }
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //comenza aqui
}
