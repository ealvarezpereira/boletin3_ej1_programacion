package boletin3;

import java.util.Scanner;



public class Boletin3 {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        
        System.out.println("Velocidad del coche antes de acelerar");
        
        System.out.println(coche1.getVelocidad());
        
        System.out.println("Velocimetro:");
        
        Scanner sc = new Scanner(System.in);
        
        coche1.acelerar(sc.nextInt());
        
        System.out.println("Velocidad del coche al acelerar");
        
        System.out.println(coche1.getVelocidad()+" Km/h");
            
        System.out.println("Velocimetro:");
        
        coche1.frenar(sc.nextInt());
        
        System.out.println("Velocidad del coche al frenar");
        
        System.out.println(coche1.getVelocidad()+" Km/h");
    }
    
}

