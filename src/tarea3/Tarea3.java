package tarea3;

import java.util.*;

public class Tarea3 {

    private static Scanner Entrada;
    private static Scanner Entrada1;
    public static String Usuarios [] = new String [5];
    public static String Auxiliar;
    
    public static void Menu() {
        Entrada = new Scanner(System.in);
        int option;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("                           [IPC1]Tarea3_201602784");
            System.out.println("");
            System.out.println("                                    Menú");
            System.out.println("");
            System.out.println("Ingrese la opción a la que desea ingresar:");
            System.out.println("");
            System.out.println("1.- Usuarios");
            System.out.println("2.- Contador de dígitos repetidos");
            System.out.println("3.- Tres números de mayor a menor");
            System.out.println("4.- Calcular promedio");
            System.out.println("5.- Salir del Sistema");
            System.out.println("");
            System.out.println("Nota:");
            System.out.println("Cuando se termine un ejercicio, el sistema lo devolverá automáticamente a este menú.");

            option = Entrada.nextInt();
            switch (option) {
                case 1:
                    Usuarios();
                    break;

                case 2:
                    //Par();
                    break;

                case 3:
                    Orden();
                    break;

                case 4:
                    //Suma();
                    break;

                case 5:
                    //Close();
                    break;

                default:
                    System.out.println("Usted ingresó una opción incorrecta");
            }

        } while (option != 5);
        Entrada.close();
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
        for(int i = 0; i< Usuarios.length; i++){
            System.out.println(Usuarios[i]);
        }
    }
    
    public static void Usuarios() {
        Entrada1 = new Scanner(System.in);
        int option1;
        do {
            System.out.println("");
            System.out.println("1- Ingresar Usuarios");
            System.out.println("2- Mostrar Usuarios en forma Descendente");
            System.out.println("3- Mostrar Usuarios en forma Ascendente");
            System.out.println("4- Regresar al Menú principal");

            option1=Entrada1.nextInt();
            switch(option1){
                case 1:
                    IUsuarios();
                    break;
                
                case 2:
                    UsuariosD();
                    break;
                
                case 3:
                    UsuariosA();
                    break;
                    
                case 4:
                    Menu();
                    break;
       
                
                default:
                    System.out.println("Usted ingresó una opción incorrecta");
            }
            
        }while(option1!=4);
        Menu();
    }
    
    public static void Orden(){
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("");
        System.out.println("Orden de números en forma descendente");
        System.out.println("");
        System.out.println("Ingrese el primer número");
        a=scn.nextInt();
        System.out.println("Ingrese el segundo número");
        b=scn.nextInt();
        System.out.println("Ingrese el tercer número");
        c=scn.nextInt();
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
    }
    
    public static void main(String[] args) {

        Menu();
    }

}