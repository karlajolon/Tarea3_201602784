package tarea3;

import java.util.*;

public class Tarea3 {

    private static Scanner Entrada;
    private static Scanner Entrada1;
    private static Scanner Entrada2;
    public static String Usuarios [] = new String [5];
    public static String Auxiliar;
    
    public static void Menu() {
        try {
        Entrada = new Scanner(System.in);
        int option;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("                           [IPC1]Tarea3_201602784");
            System.out.println("");
            System.out.println("                                    Menú");
            System.out.println("");    
            System.out.println("1.- Usuarios");
            System.out.println("2.- Contador de Dígitos Repetidos");
            System.out.println("3.- Tres Números de Mayor a Menor");
            System.out.println("4.- Calcular Promedio");
            System.out.println("5.- Salir del Sistema");
            System.out.println("");
            System.out.println("Nota:");
            System.out.println("Cuando se termine un ejercicio, el sistema lo devolverá automáticamente a este menú.");
            System.out.println("");
            System.out.println("Escriba la opción a la que desea ingresar:");
            
            option = Entrada.nextInt();
            switch (option) {
                case 1:
                    Usuarios();
                    break;

                case 2:
                    Contador();
                    break;

                case 3:
                    Orden();
                    break;

                case 4:
                    Promedios();
                    break;

                case 5:
                    Close();
                    break;

                default:
                    System.out.println("Usted ingresó una opción incorrecta");
            }

        } while (option != 5);
        Entrada.close();
    } catch (Exception e) {
            System.out.println("");
            System.out.println("***ATENCIÓN***");
            System.out.println("¡EL INGRESO DE LETRAS Y/O SIGNOS NO ESTÁ PERMITIDO!");
            System.out.println("");
            Menu();

        }
    } 
    
    public static void IUsuarios(){
        Scanner Nombres = new Scanner(System.in);
        
        for (int i = 0;i < Usuarios.length; i++){
            System.out.println("");
            System.out.println("Ingrese un usuario");
            Auxiliar = Nombres.next();
            Usuarios[i] = Auxiliar;
        }
    }
    
    public static void UsuariosA(){
        for(int i = Usuarios.length-1; i >=0; i--){
            System.out.println(Usuarios[i]);
        }
    }
    
    public static void UsuariosD(){
        for (int i = 0; i< Usuarios.length; i++){
            System.out.println(Usuarios[i]);
        }
    }
    
    public static void Usuarios() {
        try {
        Entrada1 = new Scanner(System.in);
        int option1;
        do {
            System.out.println("");
            System.out.println("1.- Ingresar Usuarios");
            System.out.println("2.- Mostrar Usuarios en Forma Ascendente");
            System.out.println("3.- Mostrar Usuarios en Forma Descendente");
            System.out.println("4.- Regresar al Menú Principal");
            System.out.println("");

            option1=Entrada1.nextInt();
            switch(option1){
                case 1:
                    IUsuarios();
                    break;
                
                case 2:
                    UsuariosA();
                    break;
                
                case 3:
                    UsuariosD();
                    break;
                    
                case 4:
                    Menu();
                    break;
       
                
                default:
                    System.out.println("Usted ingresó una opción incorrecta");
            }
            
        }while(option1!=4);
        Menu();
     } catch (Exception e) {
            System.out.println("");
            System.out.println("***ATENCIÓN***");
            System.out.println("¡EL INGRESO DE LETRAS Y/O SIGNOS NO ESTÁ PERMITIDO!");
            System.out.println("");
            Usuarios();
        }
    }
    
    public static void Orden(){
        try {
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("");
        System.out.println("Ingrese el primer número");
        a=scn.nextInt();
        System.out.println("Ingrese el segundo número");
        b=scn.nextInt();
        System.out.println("Ingrese el tercer número");
        c=scn.nextInt();
        System.out.println("");
        System.out.println("               Números en Forma Descendente");
        if(a>=b && b>=c){
            System.out.println("El orden es: "+a+","+b+","+c);
            System.out.println("");
            System.out.println("");
        } else{
            if(b>=a && a>=c){
                System.out.println("El orden es: "+b+","+a+","+c);
                System.out.println("");
                System.out.println("");
            } else{
                if(c>=b && b>=a){
                    System.out.println("El orden es: "+c+","+b+","+a);
                    System.out.println("");
                    System.out.println("");
                }else{
                    if(b>=a && b>=c){
                        System.out.println("El orden es: "+b+","+c+","+a);
                        System.out.println("");
                        System.out.println("");
                    } else{
                        if(c>=a && a>=b){
                            System.out.println("El orden es: "+c+","+a+","+b);
                            System.out.println("");
                            System.out.println("");
                        } else{
                            if(a>=b && c>=b){
                                System.out.println("El orden es: "+a+","+c+","+b);
                                System.out.println("");
                                System.out.println("");
                            
                            }
                        }
                    }
                }
            }
        }  
    } catch (Exception e) {
            System.out.println("");
            System.out.println("***ATENCIÓN***");
            System.out.println("¡EL INGRESO DE LETRAS Y/O SIGNOS NO ESTÁ PERMITIDO!");
            System.out.println("");
            Orden();
        }
    }
    
    public static void Promedios() {
        try {
        Scanner Notas = new Scanner(System.in);
        int Calificaciones[][] = new int[6][6];
        double suma0, suma1, suma2, suma3, suma4, suma5;
        double promedio0, promedio1, promedio2, promedio3, promedio4, promedio5;

        System.out.println("");
        System.out.println("Ingrese las notas del primer alumno");
        Calificaciones[2][0] = Notas.nextInt();
        Calificaciones[3][0] = Notas.nextInt();
        Calificaciones[4][0] = Notas.nextInt();
        Calificaciones[5][0] = Notas.nextInt();

        System.out.println("");
        System.out.println("Ingrese las notas del segundo alumno");
        Calificaciones[2][1] = Notas.nextInt();
        Calificaciones[3][1] = Notas.nextInt();
        Calificaciones[4][1] = Notas.nextInt();
        Calificaciones[5][1] = Notas.nextInt();

        System.out.println("");
        System.out.println("Ingrese las notas del tercer alumno");
        Calificaciones[2][2] = Notas.nextInt();
        Calificaciones[3][2] = Notas.nextInt();
        Calificaciones[4][2] = Notas.nextInt();
        Calificaciones[5][2] = Notas.nextInt();

        System.out.println("");
        System.out.println("Ingrese las notas del cuarto alumno");
        Calificaciones[2][3] = Notas.nextInt();
        Calificaciones[3][3] = Notas.nextInt();
        Calificaciones[4][3] = Notas.nextInt();
        Calificaciones[5][3] = Notas.nextInt();

        System.out.println("");
        System.out.println("Ingrese las notas del quinto alumno");
        Calificaciones[2][4] = Notas.nextInt();
        Calificaciones[3][4] = Notas.nextInt();
        Calificaciones[4][4] = Notas.nextInt();
        Calificaciones[5][4] = Notas.nextInt();

        System.out.println("");
        System.out.println("Ingrese las notas del sexto alumno");
        Calificaciones[2][5] = Notas.nextInt();
        Calificaciones[3][5] = Notas.nextInt();
        Calificaciones[4][5] = Notas.nextInt();
        Calificaciones[5][5] = Notas.nextInt();

        suma0 = Calificaciones[2][0] + Calificaciones[3][0] + Calificaciones[4][0] + Calificaciones[5][0];
        suma1 = Calificaciones[2][1] + Calificaciones[3][1] + Calificaciones[4][1] + Calificaciones[5][1];
        suma2 = Calificaciones[2][2] + Calificaciones[3][2] + Calificaciones[4][2] + Calificaciones[5][2];
        suma3 = Calificaciones[2][3] + Calificaciones[3][3] + Calificaciones[4][3] + Calificaciones[5][3];
        suma4 = Calificaciones[2][4] + Calificaciones[3][4] + Calificaciones[4][4] + Calificaciones[5][4];
        suma5 = Calificaciones[2][5] + Calificaciones[3][5] + Calificaciones[4][5] + Calificaciones[5][5];

        promedio0 = (suma0 / 4);
        promedio1 = (suma1 / 4);
        promedio2 = (suma2 / 4);
        promedio3 = (suma3 / 4);
        promedio4 = (suma4 / 4);
        promedio5 = (suma5 / 4);

        System.out.println("");
        System.out.println("Alumno 1" + "   " + Calificaciones[2][0] + "   " + Calificaciones[3][0] + "   " + Calificaciones[4][0] + "   " + Calificaciones[5][0] + "   " + promedio0);
        System.out.println("Alumno 2" + "   " + Calificaciones[2][1] + "   " + Calificaciones[3][1] + "   " + Calificaciones[4][1] + "   " + Calificaciones[5][1] + "   " + promedio1);
        System.out.println("Alumno 3" + "   " + Calificaciones[2][2] + "   " + Calificaciones[3][2] + "   " + Calificaciones[4][2] + "   " + Calificaciones[5][2] + "   " + promedio2);
        System.out.println("Alumno 4" + "   " + Calificaciones[2][3] + "   " + Calificaciones[3][3] + "   " + Calificaciones[4][3] + "   " + Calificaciones[5][3] + "   " + promedio3);
        System.out.println("Alumno 5" + "   " + Calificaciones[2][4] + "   " + Calificaciones[3][4] + "   " + Calificaciones[4][4] + "   " + Calificaciones[5][4] + "   " + promedio4);
        System.out.println("6." + "   " + Calificaciones[2][5] + "   " + Calificaciones[3][5] + "   " + Calificaciones[4][5] + "   " + Calificaciones[5][5] + "   " + promedio5);
    } catch (Exception e) {
            System.out.println("");
            System.out.println("***ATENCIÓN***");
            System.out.println("¡EL INGRESO DE LETRAS Y/O SIGNOS NO ESTÁ PERMITIDO!");
            System.out.println("");
            Promedios();
        }
    }

    public static void Close() {
        System.out.println("Saliendo del sistema.....");
        System.exit(0);
    }

    public static void Contador() {
        try {
        Entrada2 = new Scanner(System.in);
        int Option2;
        do {
            System.out.println("");
            System.out.println("1.- Ingresar Número");
            System.out.println("2.- Regresar al Menú Principal");

            Option2 = Entrada2.nextInt();
            switch (Option2) {
                case 1:
                    IDigitos();
                    break;

                case 2:
                    Menu();
                    break;

                default:
                    System.out.println("Usted ingresó una opción incorrecta");
            }

        } while (Option2 != 2);
        Menu();
    } catch (Exception e) {
            System.out.println("");
            System.out.println("***ATENCIÓN***");
            System.out.println("¡EL INGRESO DE LETRAS Y/O SIGNOS NO ESTÁ PERMITIDO!");
            System.out.println("");
            Contador();
        }
    }

    public static void IDigitos() {
        try {
        Scanner lector = new Scanner(System.in);
        System.out.println("");
        System.out.println("Escriba un número para evaluar");
        String cadena = lector.nextLine();
        int contador = 0;
        char caracter = 0;

        while (cadena.length() != 0) { 
            int contadorAux = 0;
            for (int j = 0; j < cadena.length(); j++) { 
                if (cadena.charAt(0) == cadena.charAt(j)) {
                    contadorAux++;
                }
            }

            if (contadorAux > contador) { 
                contador = contadorAux;
                caracter = cadena.charAt(0);
            }

            
            cadena = cadena.replaceAll(cadena.charAt(0) + "", "");
        }
        System.out.println("");
        System.out.println("El número: " + caracter + " se repite " + contador + " veces.");
     } catch (Exception e) {
            System.out.println("");
            System.out.println("***ATENCIÓN***");
            System.out.println("¡EL INGRESO DE LETRAS Y/O SIGNOS NO ESTÁ PERMITIDO!");
            System.out.println("");
            IDigitos();
        }
    }
    
    public static void main(String[] args) {

        Menu();
    }

}